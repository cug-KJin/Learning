drop table Users;
create table Users(
userId int(11)  NOT NULL primary key,
userName varchar(16),
passWord varchar(16)
);
insert Users values (01,"张一","123456");
insert Users values (02,"张二","123456");
insert Users values (03,"张三","123456");
select * from Users;
update Users set passWord = "123" where userId = 1;
