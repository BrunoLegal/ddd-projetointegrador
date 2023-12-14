
create database hospital;

use hospital;

create user "admin" identified by "1234";
grant all privileges on *.* to "admin" with grant option;

create table funcionarios(
codigo_funcionario int primary key auto_increment,
nome_completo varchar(100) not null,
numero_rg varchar(12) not null,
orgao_emissor varchar(6) not null,
numero_cpf varchar(14) not null,
endereco varchar(50) not null,
numero varchar(15) not null,
complemento varchar(30),
bairro varchar(40) not null,
cidade varchar(40) not null,
estado varchar(2) not null,
telefone varchar(20) not null,
celular varchar(20),
numero_ctps varchar(20) not null,
numero_pis varchar(20) not null,
data_nascimento date not null
);



create table especialidades(
Codigo_Especialidade INT PRIMARY KEY auto_increment,
Descricao_Especialidade VARCHAR(45) not null
);


create table convenios(
codigo_convenio int primary key auto_increment,
empresa_convenio varchar(45) not null,
cnpj varchar(18) not null,
telefone varchar(20) not null
);


create table usuarios(
registro_usuario int primary key auto_increment,
indentificacao_usuario varchar(20) not null,
senha_acesso varchar(10) not null,
cadastro_funcionario varchar(1) not null,
cadastro_usuario varchar(1) not null,
cadastro_paciente varchar(1) not null,
cadastro_especialidade varchar(1) not null,
cadastro_medico varchar(1) not null,
cadastro_convenio varchar(1) not null,
agendamento_consulta varchar(1) not null,
cancelamento_consulta varchar(1) not null,
modulo_administrativo varchar(1) not null,
modulo_agendamento varchar(1) not null,
modulo_atendimento varchar(1) not null
);


create table medicos(
codigo_medico int primary key auto_increment,
nome_medico varchar(50) not null,
crm varchar(20) not null,
codigo_especialidade int not null,

foreign key(codigo_especialidade)
references especialidades(codigo_especialidade)
);


create table pacientes(
codigo_paciente int primary key auto_increment,
nome varchar(50) not null,
numero_rg varchar(12) not null,
orgao_emissor varchar(6) not null,
numero_cpf varchar(14) not null,
endereco varchar(15) not null,
complemento varchar(30) not null,
bairro varchar(40) not null,
cidade varchar(40) not null,
estado varchar(2) not null,
telefone varchar(20) not null,
celular varchar(20) not null,
data_nascimento date not null,
sexo varchar(1) not null,
tem_convenio varchar(1) not null,
codigo_convenio int,

foreign key(codigo_convenio)
references convenios(codigo_convenio)
);


create table agenda_consulta(
registro_agenda int primary key auto_increment,
registro_usuario int,
codigo_paciente int,
codigo_medico int,
data date,
hora varchar(5),
retorno varchar(1),
cancelado varchar(1),
motivo_cancelamento text,

foreign key(registro_usuario)
references usuarios(registro_usuario),

foreign key(codigo_paciente)
references pacientes(codigo_paciente),

foreign key(codigo_medico)
references medicos(codigo_medico)
);


create table prontuario_paciente(
registro int primary key auto_increment,
registro_agenda int,
historico text,
receituario text,
exames text,

foreign key(registro_agenda)
references agenda_consulta(registro_agenda)
);

insert into usuarios values (null, "admin", "admin", "y", "y", "y", "y", "y", "y", "y", "y", "y", "y", "y" );

