package com.pocketm.tgbot.web;

import com.pocketm.tgbot.response.ChartViewResponse;
import com.pocketm.tgbot.services.candle.CandleApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DataController {

    private final CandleApiService candleApiService;

    @GetMapping("/data.json")
    public List<ChartViewResponse> getData() {
        return candleApiService.getData();
    }
}
