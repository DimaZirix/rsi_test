package com.pocketm.tgbot.services.candle;

import com.pocketm.tgbot.response.ChartViewResponse;

import java.util.List;

public interface CandleApiService {
    List<ChartViewResponse> getData();
}
