package com.pocketm.tgbot.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@ToString
@Getter
@RequiredArgsConstructor
public class CandleDTO {

    private final Instant candleTime;

    private final BigDecimal open;

    private final BigDecimal close;

    private final BigDecimal high;

    private final BigDecimal low;

}
