# 1: n
# 1 : 1

# 직원 정보
#id, 이름, 생년원일, 주소, 직급, 연봉

# 직원 연봉
# id, 연봉

# n : n (다 대 다)
# -> 연결 테이블 생성
# 고객
# id, 고객명, 주소, 상품Id


# 상품
#id, 상푸명, 가격

# 주문정보
# 고객ID, 상품ID

USE db1;
CREATE TABLE my_table41
(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(20),
    address VARCHAR(20)
);

CREATE TABLE my_table42
(
    id    INT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(20),
    price VARCHAR(20)
);

CREATE TABLE my_table43
(
    customer_id INT NOT NULL REFERENCES my_table41 (id),
    product_id  INT NOT NULL REFERENCES my_table42 (id)
);
