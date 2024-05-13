package ru.iot.card.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.iot.card.dto.BalanceDto;
import ru.iot.card.dto.CardDto;
import ru.iot.card.service.CardService;

@Slf4j
@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @PostMapping
    private void create(@RequestBody CardDto cardDto) {
        log.info("Привязка новой карты {}", cardDto);
        cardService.save(cardDto);
    }


    @PutMapping
    private void update(@RequestBody BalanceDto balanceDto) {
        log.info("Обновление баланса {}", balanceDto);
        cardService.update(balanceDto);
    }

}
