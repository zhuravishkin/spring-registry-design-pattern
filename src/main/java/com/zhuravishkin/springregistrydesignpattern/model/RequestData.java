package com.zhuravishkin.springregistrydesignpattern.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RequestData {
    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("transformer_id")
    private Integer transformerId;
}
