package com.pocketm.tgbot.services.binance.impl;

import com.binance.connector.futures.client.impl.UMWebsocketClientImpl;
import com.pocketm.tgbot.dto.CandleDTO;
import com.pocketm.tgbot.services.binance.BinanceReadService;
import com.pocketm.tgbot.dto.BinanceCandleDTO;
import com.pocketm.tgbot.utils.JsonToObjectConverter;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class BinanceReadServiceImpl implements BinanceReadService {

    private final JsonToObjectConverter jsonToObjectConverter;

    private final Map<Instant, CandleDTO> dataList = Collections.synchronizedMap(new LinkedHashMap<>());

    @PostConstruct
    protected void init() {
        start();
    }

    @Override
    public void start() {
        final var client = new UMWebsocketClientImpl();
        client.klineStream("btcusdt", "1m", ((event) -> {
            final BinanceCandleDTO binanceDTO = jsonToObjectConverter.readJson(event, BinanceCandleDTO.class);

            final var dto = CandleDTO.builder()
                .candleTime(Instant.ofEpochMilli(binanceDTO.getPrice().getStartTime()))
                .open(binanceDTO.getPrice().getOpen())
                .close(binanceDTO.getPrice().getClose())
                .high(binanceDTO.getPrice().getHigh())
                .low(binanceDTO.getPrice().getLow())
                .build();

            dataList.put(dto.getCandleTime(), dto);

            System.out.println(dto);
            //System.out.println(event);
        }));
    }

    @Override
    public List<CandleDTO> read() {
        return List.copyOf(dataList.values());
    }
}
