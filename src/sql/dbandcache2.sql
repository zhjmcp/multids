set names utf8;
set foreign_key_checks=0;
create database microservicedb2;
use microservicedb2;
drop table if exists `t_car`;
create table `t_car`(
	`id` bigint(20) not null auto_increment,
	`name` varchar(50) not null comment '车名',
	`color` varchar(255)	not null comment '车的颜色',
	`owner` bigint(20) not null comment '车主',
	primary key (`id`)
)
engine=innodb auto_increment=2 default charset=utf8;

begin;
insert into `t_car` values ('1','奥迪','red','1');
commit;

set foreign_key_checks=1;