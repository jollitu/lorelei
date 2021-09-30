create database if not exists user;

create table if not exists user(
    user_auto_id int auto_increment primary key,
    username varchar(20) not null,
    password varchar(20) not null,
    email varchar(100) not null,
    last_login varchar(8),
    banned boolean not null,
    credentials_valid boolean not null
) engine=INNODB;