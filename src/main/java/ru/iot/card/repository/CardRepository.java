package ru.iot.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.iot.card.domain.Card;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CardRepository extends JpaRepository<Card, UUID> {
    Optional<Card> findByClientId(UUID clientId);
}
