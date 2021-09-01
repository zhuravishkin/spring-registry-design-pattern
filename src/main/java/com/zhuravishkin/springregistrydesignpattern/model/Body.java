package com.zhuravishkin.springregistrydesignpattern.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Body {
    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("transformer_id")
    private Integer transformerId;
}
