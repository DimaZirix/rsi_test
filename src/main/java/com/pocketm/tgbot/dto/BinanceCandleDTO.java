package com.pocketm.tgbot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class BinanceCandleDTO {

    @JsonProperty("E")
    private long time;

    @JsonProperty("s")
    private String symbol;

    @JsonProperty("k")
    private PriceDTO price;

    @Getter
    @Setter
    @ToString
    public static class PriceDTO {
        @JsonProperty("t")
        private long startTime;

        @JsonProperty("o")
        private BigDecimal open;

        @JsonProperty("c")
        private BigDecimal close;

        @JsonProperty("h")
        private BigDecimal high;

        @JsonProperty("l")
        private BigDecimal low;
    }

}
