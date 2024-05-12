package ru.iot.card.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.UUIDJdbcType;

import java.util.UUID;

@Entity
@Table(name = "cards")
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcType(UUIDJdbcType.class)
    private UUID id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "cvv")
    private String cvv;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "client_id")
    private UUID clientId;

}
