# UNION 합집합
# 중복 안나옴
USE db1;
CREATE TABLE my_table54
(
    id   INT,
    name VARCHAR(20)
);
CREATE TABLE my_table55
(
    id      INT,
    address VARCHAR(20)
);

INSERT INTO my_table54
VALUES (1, 'seoul'),
       (2, 'henkang'),
       (3, 'jeju');

INSERT INTO my_table55
VALUES (4, 'busan'),
       (5, 'dokdo');

INSERT INTO my_table55
VALUES (3, 'jeju');

SELECT *
FROM my_table54
UNION
SELECT *
FROM my_table55;