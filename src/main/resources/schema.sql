DROP TABLE IF EXISTS brand;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS product;

create table brand(brandid int NOT NULL PRIMARY KEY,barandname varchar(255));

create table category(categoryid int NOT NULL PRIMARY KEY,categoryname varchar(255));


create table product(productid int NOT NULL,
PRIMARY KEY (productid),
price numeric(5,2),
color varchar(50),
sku varchar(100),
brandid int,
categoryid int,
FOREIGN KEY (brandid) REFERENCES brand(brandid),
FOREIGN KEY (categoryid) REFERENCES category(categoryid));