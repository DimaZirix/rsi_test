package com.pocketm.tgbot.services.candle.impl;

import com.pocketm.tgbot.response.ChartViewResponse;
import com.pocketm.tgbot.services.binance.BinanceReadService;
import com.pocketm.tgbot.services.candle.CandleApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class CandleApiServiceImpl implements CandleApiService {

    private final BinanceReadService binanceReadService;

    @Override
    public List<ChartViewResponse> getData() {
        final var dataList = binanceReadService.read();

        return dataList.stream()
            .map(p ->
                ChartViewResponse.builder()
                    .date(p.getCandleTime().toString())
                    .open(p.getOpen())
                    .close(p.getClose())
                    .high(p.getHigh())
                    .low(p.getLow())
                    .build()
            )
            .toList();
    }
}
