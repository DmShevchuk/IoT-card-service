package ru.iot.card.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.iot.card.dto.BalanceDto;
import ru.iot.card.dto.CardDto;
import ru.iot.card.service.CardService;

@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @PostMapping
    private void create(@RequestBody CardDto cardDto) {
        cardService.save(cardDto);
    }


    @PutMapping
    private void update(@RequestBody BalanceDto balanceDto) {
        cardService.update(balanceDto);
    }

}
