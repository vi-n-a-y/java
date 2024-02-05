create table user_regi(
id int auto_increment primary key,
user_name varchar(30) unique,
first_name varchar(30) not null,
last_name varchar(30) not null,
phone_number varchar(15) not null,
email varchar(50) not null);

insert into user_regi(user_name,first_name,last_name,phone_number,email) values
("balu","bala","vinay","89756451287","balu@com.eg"),
("vinay","abcd","efghi","9156487234","vinay@eg.com");
select * from user_regi;
