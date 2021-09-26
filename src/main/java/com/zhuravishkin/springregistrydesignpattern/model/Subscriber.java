package com.zhuravishkin.springregistrydesignpattern.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "subscribers")
@NoArgsConstructor
@AllArgsConstructor
public class Subscriber {
    @Id
    @JsonProperty("phone_number")
    @Column(name = "phone_number")
    private String phoneNumber;

    @JsonProperty("first_name")
    @Column(name = "first_name")
    private String firstName;

    @JsonProperty("sur_name")
    @Column(name = "sur_name")
    private String surName;

    @JsonProperty("age")
    @Column(name = "age")
    private Integer age;

    @JsonProperty("email")
    @Column(name = "email")
    private String email;

    @Column(name = "balance")
    private Integer balance;

    @JsonProperty("event_time")
    @Column(name = "event_time")
    private LocalDateTime eventTime;
}
