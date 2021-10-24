create database db_escola

USE db_escola;

create table tb_estudantes (
id bigint auto_increment,
nome varchar(30) not null,
cpf bigint(11) not null,
notas decimal(2,1)not null,
aprovado boolean,
primary key(id) );

insert into tb_estudantes (nome,cpf,notas,aprovado) values
("jonatas",78945612352,9.5, true),
("luis",15698742650,8.0, true),
("mariana",58741236589,7.0, true),
("mario",95632146580,4.5, false),
("ronaldo",25411136320,4.0, false),
("olivia",55896741250,9.0, true),
("jose",87742369514,8.0, true),
("giovana",46455501250,0.0, true);

select nome,notas,aprovado from tb_estudantes where notas > 7.0 order by notas asc

select nome,notas,aprovado from tb_estudantes where notas < 7.0 order by notas asc

UPDATE tb_estudantes set notas = 5.0 where id = 16;