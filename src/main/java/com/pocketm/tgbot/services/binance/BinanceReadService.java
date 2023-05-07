package com.pocketm.tgbot.services.binance;

import com.pocketm.tgbot.dto.CandleDTO;

import java.util.List;

public interface BinanceReadService {
    void start();

    List<CandleDTO> read();
}
