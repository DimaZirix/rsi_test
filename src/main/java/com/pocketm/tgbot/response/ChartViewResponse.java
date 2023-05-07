package com.pocketm.tgbot.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Builder
@ToString
@Getter
@RequiredArgsConstructor
public class ChartViewResponse {

    @JsonProperty("date")
    private final String date;

    @JsonProperty("o")
    private final BigDecimal open;

    @JsonProperty("c")
    private final BigDecimal close;

    @JsonProperty("h")
    private final BigDecimal high;

    @JsonProperty("l")
    private final BigDecimal low;

}
