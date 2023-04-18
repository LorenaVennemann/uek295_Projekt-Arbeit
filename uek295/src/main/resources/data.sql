INSERT INTO author (id, first_name, last_name)
VALUES (1, 'hello', 'daniel'),
       (2, 'hi', 'daniel'),
       (3, 'hu', 'daniel'),
       (4, 'poe', 'daniel'),
       (5, 'john', 'daniel'),
       (6, 'hi', 'daniel');

INSERT INTO blog_entry (author_id, text, date)
VALUES (1, 'hello', '2007-10-10'),
       (2, 'hi', '2023-04-05'),
       (3, 'hu', '1999-05-06'),
       (4, 'poe', '1973-03-04'),
       (5, 'john', '1999-12-10'),
       (6, 'hi', '1899-03-09');

INSERT INTO users (username, password)
VALUES ('Poe', 'password');

INSERT INTO users (username, password)
VALUES ('pin', 'password');

INSERT INTO users (username, password)
VALUES ('pue', 'password');

INSERT INTO role (role_name)
VALUES ('ADMIN');

INSERT INTO role (role_name)
VALUES ('USER');

INSERT INTO authority (authority_name)
VALUES ('CREATE');

INSERT INTO authority (authority_name)
VALUES ('READ');

INSERT INTO authority (authority_name)
VALUES ('UPDATE');

INSERT INTO authority (authority_name)
VALUES ('DELETE');

INSERT INTO user_role
VALUES (1, 1);

INSERT INTO user_role
VALUES (2, 2);

INSERT INTO user_role
VALUES (3, 2);

INSERT INTO role_authority
VALUES (1, 1);

INSERT INTO role_authority
VALUES (1, 2);

INSERT INTO role_authority
VALUES (1, 3);

INSERT INTO role_authority
VALUES (1, 4);

INSERT INTO role_authority
VALUES (2, 2);