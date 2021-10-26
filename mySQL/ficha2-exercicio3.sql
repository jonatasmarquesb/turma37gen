create database db_farmacia_do_bem

USE db_farmacia_do_bem

CREATE TABLE tb_categoria (
id BigInt auto_increment,
tipo varchar(30) not null,
desconto varchar(30),
primary key (id));

create table tb_produto (
id bigInt auto_increment,
nome varchar(30),
qtde varchar(30),
preco decimal(10,2), 
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id) );

insert into tb_categoria(tipo,desconto) values
("Remédios", "25%"),
("Higiene", "30%"),
("Alimentação", "15%"),
("Suplementos", "15%"),
("Outros produtos", "5%");



insert into tb_produto(nome,qtde,preco,categoria_id) values
("Dipirona","100g","10.99",1),
("Paracetamol","150g","5.99",1),
("Sabonete Líquido Facial","400ml","70.00",2),
("Hidratante Facial","200ml","55.99",2),
("Barra de chocolate","90g","9.99",3),
("WHEY Proteína","900g","80.99",4),
("Preservativos","Tamanho Único","15.00",5),
("Pilhas palito","6 Unidades","35.50",5); 

drop table tb_produto



select nome,qtde,preco from tb_produto where preco >50 order by preco desc;

select nome,qtde,preco from tb_produto where preco >= 3 and preco <=60 order by preco desc;

select nome,qtde,preco from tb_produto where nome like "b%";

select tb_categoria.tipo,tb_produto.nome,tb_produto.qtde,tb_produto.preco,tb_categoria.desconto
from tb_categoria
inner join tb_produto on tb_produto.categoria_id = tb_categoria.id;

select tb_categoria.tipo,tb_produto.nome,tb_produto.qtde,tb_produto.preco,tb_categoria.desconto
from tb_categoria
inner join tb_produto on tb_produto.categoria_id = tb_categoria.id
where tb_categoria.tipo = "Outros produtos";