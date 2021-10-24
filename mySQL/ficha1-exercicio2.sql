create database db_ecommerce

USE db_ecommerce;

create table tb_produtos (
id bigint auto_increment,
nome varchar(30) not null,
preco decimal(10,2)not null,
marca varchar(30)not null,
vendas bigint,
primary key(id) );

insert into tb_produtos (nome,preco,marca) values
("notebook",3000.00,"dell"),
("cabo hdmi",30.00,"chinatown"),
("mouse",15.00,"logitech"),
("teclado",100.00,"multilaser"),
("web cam",300.00,"canon"),
("pc montado",5000.00,"lojaoPC"),
("suporte notebook",30.00,"unknownTech"),
("headset",250.00,"25ofmarch");

select nome,preco,marca from tb_produtos where preco > 500 order by preco asc

select nome,preco,marca from tb_produtos where preco < 500 order by preco asc

UPDATE tb_produtos set preco = 25.00 where id = 3;

