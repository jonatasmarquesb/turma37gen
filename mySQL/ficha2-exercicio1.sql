create database db_generation_game_online

USE db_generation_game_online

CREATE TABLE tb_classe (
id BigInt auto_increment,
classe varchar(30) not null,
titulo varchar(30),
primary key (id));

create table tb_personagens (
id bigInt auto_increment,
nome varchar(30),
atack bigint(3),
defesa bigint(3), 
classe_id bigint,
primary key(id),
foreign key(classe_id) references tb_classe(id) );

insert into tb_classe(classe,titulo) values
("Paladino", "El"),
("Druida", "The");


insert into tb_personagens(nome,atack,defesa,classe_id) values
("lordzinho",100,200,1),
("sheik",300,300,2),
("ablabluble",500,400,3),
("lek",900,850,4),
("manobrown",700,600,5),
("jureg",750,900,1),
("theboy",850,850,3),
("gandalf",950,950,2);

select nome,atack from tb_personagens where atack >200 order by atack desc;

select nome,defesa from tb_personagens where defesa >= 100 and defesa <=200;

select nome from tb_personagens where nome like "l%";

select tb_classe.titulo,tb_personagens.nome,tb_classe.classe
from tb_classe
inner join tb_personagens on tb_personagens.classe_id = tb_classe.id;

select tb_classe.titulo,tb_personagens.nome,tb_classe.classe
from tb_classe
inner join tb_personagens on tb_personagens.classe_id = tb_classe.id
where tb_classe.classe = "Mago"





