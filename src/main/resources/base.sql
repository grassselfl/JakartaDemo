create database if not exists basedb charset utf8mb4 collate utf8mb4_general_ci;

use basedb;

drop table if exists basedb.basetable;

create table if not exists basetable(
        id int primary key AUTO_INCREMENT,
        msg varchar(20) unique,
        replymsg varchar(20)
    );

insert into basedb.basetable(msg,replymsg) value('1','2');
insert into basedb.basetable(msg,replymsg) value('hello','word');
insert into basedb.basetable(msg,replymsg) value('一二三四五','上山打老虎');

select * from basedb.basetable;