create table if not exists cards
(
    id          uuid         not null primary key,
    card_number varchar(255) not null,
    cvv         varchar(255) not null,
    balance     numeric default 0,
    client_id   uuid         not null
)