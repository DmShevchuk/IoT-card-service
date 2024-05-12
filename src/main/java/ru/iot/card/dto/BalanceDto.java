package ru.iot.card.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class BalanceDto {

    private UUID clientId;
    private Double sum;

}
