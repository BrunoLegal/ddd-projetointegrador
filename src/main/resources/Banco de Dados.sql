create database Hospital;

use Hospital;

create table Funcionarios(
codigo_funcionario int primary key auto_increment,
Nome_Completo VARCHAR(100) not null,
Numero_RG VARCHAR(12) not null,
Orgao_Emissor VARCHAR(6) not null,
Numero_CPF VARCHAR(14) not null,
Endereco VARCHAR(50) not null,
Numero VARCHAR(15) not null,
Complemento VARCHAR(30) not null,
Bairro VARCHAR(40) not null,
Cidade VARCHAR(40) not null,
Estado VARCHAR(2) not null,
Telefone VARCHAR(20) not null,
celular VARCHAR(20) not null,
Numero_CTPS VARCHAR(20) not null,
Numero_PIS VARCHAR(20) not null,
Data_Nascimento DATE not null
);


create table Especialidades(
Codigo_Especialidade INT PRIMARY KEY auto_increment,
Descricao_Especialidade VARCHAR(45) not null
);


create table Convenios(
Codigo_Convenio int primary key auto_increment,
Empresa_Convenio VARCHAR(45) not null,
CNPJ VARCHAR(18) not null,
Telefone VARCHAR(20) not null
);


create table Usuarios(
Registro_Usuario int primary key auto_increment,
Indentificacao_Usuario VARCHAR(20) not null,
Senha_Acesso VARCHAR(10) not null,
Cadastro_Funcionario VARCHAR(1) not null,
Cadastro_Usuario VARCHAR(1) not null,
Cadastro_Paciente VARCHAR(1) not null,
Cadastro_Especialidade VARCHAR(1) not null,
Cadastro_Medico VARCHAR(1) not null,
Cadastro_Convenio VARCHAR(1) not null,
Agendamento_Consulta VARCHAR(1) not null,
Cancelamento_Consulta VARCHAR(1) not null,
Modulo_Administrativo VARCHAR(1) not null,
Modulo_Agendamento VARCHAR(1) not null,
Modulo_Atendimento VARCHAR(1) not null
);


create table Medicos(
Codigo_Medico int Primary key auto_increment,
Nome_Medico VARCHAR(50) not null,
CRM VARCHAR(20) not null,
Codigo_Especialidade int,

foreign key(Codigo_Especialidade)
references Especialidades(Codigo_Especialidade)
);


create table Pacientes(
Codigo_Paciente int primary key auto_increment,
Nome VARCHAR(50) not null,
Numero_RG VARCHAR(12) not null,
Orgao_Emissor VARCHAR(6) not null,
Numero_CPF VARCHAR(14) not null,
Endereco VARCHAR(15) not null,
Complemento VARCHAR(30) not null,
Bairro VARCHAR(40) not null,
Cidade VARCHAR(40) not null,
Estado VARCHAR(2) not null,
Telefone VARCHAR(20) not null,
Celular VARCHAR(20) not null,
Data_Nascimento DATE not null,
Sexo VARCHAR(1) not null,
Tem_Convenio VARCHAR(1) not null,
Senha_Acesso VARCHAR(10) not null,
Codigo_Convenio int,

foreign key(Codigo_Convenio)
references Convenios(Codigo_Convenio)
);


create table agenda_consulta(
Registro_Agenda int primary key auto_increment,
Registro_Usuario int,
Codigo_Paciente int,
Codigo_Medico int,
Data DATE,
Hora VARCHAR(5),
Retorno VARCHAR(1),
Cancelado VARCHAR(1),
Motivo_Cancelamento TEXT,

foreign key(Registro_Usuario)
references Usuarios(Registro_Usuario),

foreign key(Codigo_Paciente)
references Pacientes(Codigo_Paciente),

foreign key(Codigo_Medico)
references Medicos(Codigo_Medico)
);


create table prontuario_paciente(
Registro int primary key auto_increment,
Registro_Agenda int,
Historico TEXT,
Receituario TEXT,
Exames TEXT,

foreign key(Registro_Agenda)
references Agenda_consulta(Registro_Agenda)
);