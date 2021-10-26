create database db_blog_pessoal

use db_blog_pessoal

create table tb_temas (
id bigint auto_increment,
descricao varchar(255) not null,
primary key(id));

create table tb_usuarios (
id bigint auto_increment,
nome varchar(255) not null,
usuario varchar(255) not null,
senha varchar(255) not null,
primary key(id) );

create table tb_postagens (
id bigint auto_increment,
titulo varchar(255) not null,
texto varchar(1000) not null,
data_post timestamp not null,
tema_id bigint not null,
usuario_id bigint not null,
primary key(id),
foreign key(tema_id) references tb_temas(id),
foreign key(usuario_id) references tb_usuarios(id));


