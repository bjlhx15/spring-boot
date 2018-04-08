create database db_products default charset utf8;

CREATE TABLE products (
	pid INT NOT NULL PRIMARY KEY auto_increment,
	pname VARCHAR (200),
	type VARCHAR (50),
	price DOUBLE,
	createTime TIMESTAMP
);