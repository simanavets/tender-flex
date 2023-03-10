--liquibase formatted sql

--changeset simanavets:1

INSERT INTO role (name)
VALUES ('BIDDER'),
       ('CONTRACTOR');

--rollback TRUNCATE TABLE role;

--changeset simanavets:2

INSERT INTO privilege(name)
VALUES ('READ_TENDER'),
       ('CREATE_OFFER'),
       ('READ_OFFER'),
       ('READ_CONTRACT_STATUS'),
       ('READ_CONTRACT_PDF'),
       ('APPROVE_DECLINE_CONTRACT'),
       ('CRATE_TENDER'),
       ('PUBLISH_TENDER'),
       ('ACCEPT_DECLINE_OFFER'),
       ('UPLOAD_CONTRACT');

--rollback TRUNCATE TABLE privilege;

--changeset simanavets:3

INSERT INTO role_privilege (role_id, privilege_id)
VALUES (1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (1, 6),
       (2, 7), (2, 8), (2, 1), (2, 3), (2, 9), (2, 10);

--rollback TRUNCATE TABLE role_privilege;