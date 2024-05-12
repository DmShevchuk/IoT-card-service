package ru.iot.card.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.iot.card.domain.Card;
import ru.iot.card.dto.BalanceDto;
import ru.iot.card.dto.CardDto;
import ru.iot.card.repository.CardRepository;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

    public void save(CardDto cardDto) {
        var clientId = cardDto.getClientId();
        Card card = cardRepository.findByClientId(clientId).orElseGet(Card::new);
        card.setCardNumber(cardDto.getCardNumber());
        card.setCvv(cardDto.getCvv());
        card.setClientId(clientId);
        cardRepository.save(card);
    }

    public void update(BalanceDto balanceDto) {
        var clientId = balanceDto.getClientId();
        Card card = cardRepository.findByClientId(clientId).orElseThrow();
        card.setBalance(Optional.ofNullable(card.getBalance()).orElse(0d) + balanceDto.getSum());
        cardRepository.save(card);
    }
}
