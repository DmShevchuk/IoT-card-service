package ru.iot.card.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CardDto {

    private UUID clientId;
    private String cardNumber;
    private String cvv;

}
