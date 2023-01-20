--liquibase formatted sql

--changeset simanavets:1

INSERT INTO role (name)
VALUES ('BIDDER'),
       ('CONTRACTOR');

--rollback TRUNCATE TABLE role;

--changeset simanavets:2

INSERT INTO privilege(name)
VALUES ('READ TENDER'),
       ('CREATE OFFER'),
       ('READ OFFER'),
       ('READ CONTRACT STATUS'),
       ('READ CONTRACT PDF'),
       ('APPROVE DECLINE CONTRACT'),
       ('CRATE TENDER'),
       ('PUBLISH TENDER'),
       ('ACCEPT DECLINE OFFER'),
       ('UPLOAD CONTRACT');

--rollback TRUNCATE TABLE privilege;