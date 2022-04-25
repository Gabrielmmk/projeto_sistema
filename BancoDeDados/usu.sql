create database usuarios;

use usuarios;

create table tbusuarios1(
login varchar(15) not null unique,
senha varchar(15) not null,
fone varchar(15),
nickname varchar(15) not null unique,
primary key (nickname)
);

describe tbusuarios1;

insert into tbusuarios1(login, senha, fone, nickname)
values('Gabriel', '123', '1111-1111', 'GabrielM');

select * from tbusuarios1;