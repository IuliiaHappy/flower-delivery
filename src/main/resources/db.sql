CREATE TABLE Client (
id BIGINT IDENTITY NOT NULL PRIMARY KEY,
name varchar(20) NOT NULL,
surname varchar(20) NOT NULL,
email varchar(50),
phone varchar(15) NOT NULL);

INSERT into Client(name , surname , email , phone) values ('Ivan', 'Ivanov', 'test@test.com', '89999999999');
INSERT into Client(name , surname , email , phone) values ('Petya', 'Petrov', 'trololo@test.com', '89999999998');
INSERT into Client(name , surname , email , phone) values ('Vasya', 'Volodin', 'smth@smth.com', '89999999997');

CREATE TABLE Product (
id BIGINT IDENTITY NOT NULL PRIMARY KEY,
name varchar(20) NOT NULL,
cost double NOT NULL);

INSERT into Product(name , cost) values ('bouquet of flowers', 1500.00);
INSERT into Product(name , cost) values ('toy', 1200.00);
INSERT into Product(name , cost) values ('sweet', 500.00);

CREATE TABLE _Order (
id BIGINT IDENTITY NOT NULL PRIMARY KEY,
client_id BIGINT NOT NULL,
cost double NOT NULL,
address varchar(200) NOT NULL,
foreign key (client_id) references client(id));

INSERT into _Order(client_id , cost, address) values (1, 2000.00, 'where');

CREATE TABLE Part_Order (
order_id BIGINT NOT NULL,
product_id BIGINT NOT NULL,
foreign key (order_id) references _order(id),
foreign key (product_id) references product(id));

INSERT into Part_Order(order_id , product_id) values (1, 1);
INSERT into Part_Order(order_id , product_id) values (1, 3);