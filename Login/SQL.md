use bank;

create  table ass1(
id int auto_increment primary key,
user_name varchar(30) not null,
user_pass varchar(30) not null);

desc ass1;

insert into ass1(user_name,user_pass) values
("vinay","12345"),
("bala","1234");

select *from ass1;
