--liquibase formatted sql

--changeset simanavets:1

CREATE TABLE IF NOT EXISTS role
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL UNIQUE
);

--rollback DROP TABLE role;

--changeset simanavets:2

CREATE TABLE IF NOT EXISTS privilege
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL UNIQUE
);

--rollback DROP TABLE privilege;

--changeset simanavets:3

CREATE TABLE IF NOT EXISTS role_privilege
(
    role_id      INT REFERENCES role (id),
    privilege_id INT REFERENCES privilege (id),
    PRIMARY KEY (role_id, privilege_id)
);

--rollback DROP TABLE role_function;

--changeset simanavets:4

CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR(128) NOT NULL UNIQUE,
    password VARCHAR(128) NOT NULL,
    email    VARCHAR(128) NOT NULL UNIQUE,
    role_id  INT REFERENCES role (id)
);

--rollback DROP TABLE users;

--changeset simanavets:5

CREATE TABLE IF NOT EXISTS tender
(
    id      SERIAL PRIMARY KEY,
    user_id INT REFERENCES users (id)
);

--rollback DROP TABLE tender;

--changeset simanavets:6

CREATE TABLE IF NOT EXISTS offer
(
    id        SERIAL PRIMARY KEY,
    user_id   BIGINT REFERENCES users (id),
    tender_id INT REFERENCES tender (id)
);

--rollback DROP TABLE offer;

--changeset simanavets:7

CREATE TABLE IF NOT EXISTS contract
(
    id        SERIAL PRIMARY KEY,
    offer_id  INT REFERENCES offer (id),
    tender_id INT REFERENCES tender (id),
    status    VARCHAR(128)
);

--rollback DROP TABLE contract;