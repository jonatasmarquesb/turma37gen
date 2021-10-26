create database db_pizzaria_legal

USE db_pizzaria_legal

CREATE TABLE tb_categoria (
id BigInt auto_increment,
tipo varchar(30) not null,
desconto varchar(30),
primary key (id));

create table tb_pizza (
id bigInt auto_increment,
nome varchar(30),
tamanho varchar(30),
preco bigint, 
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id) );

insert into tb_categoria(tipo,desconto) values
("Pizza Salgada", "25%"),
("Pizza Doce", "30%"),
("Pizza Vegetariana", "15%"),
("Pizza Vegana", "15%"),
("Calzone", "25%");



insert into tb_pizza(nome,tamanho,preco,categoria_id) values
("Calabresa","Grande",60,1),
("Mussarela","Grande",55,3),
("Brigadeiro","Médio",45,2),
("Palmito","Grande",50,3),
("Frango com Requeijão","Grande",60,1),
("Bem casado","Média",40,2),
("Shitake","Grande",65,4),
("Calzone Frango","Normal",35,5); 



select nome,preco from tb_pizza where preco >45 order by preco desc;

select nome,preco from tb_pizza where preco >= 29 and preco <=60;

select nome from tb_pizza where nome like "c%";

select tb_categoria.tipo,tb_pizza.nome,tb_pizza.tamanho,tb_pizza.preco,tb_categoria.desconto
from tb_categoria
inner join tb_pizza on tb_pizza.categoria_id = tb_categoria.id;

select tb_categoria.tipo,tb_pizza.nome,tb_pizza.tamanho,tb_pizza.preco,tb_categoria.desconto
from tb_categoria
inner join  tb_pizza on tb_pizza.categoria_id = tb_categoria.id
where tb_categoria.tipo = "Pizza Vegetariana";