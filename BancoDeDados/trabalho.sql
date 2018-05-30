-- USER SQL
CREATE USER universidade IDENTIFIED BY aluno ;

-- ROLES
GRANT "DBA" TO universidade ;
GRANT "CONNECT" TO universidade ;

CREATE TABLE professor(
  matricula NUMBER(*,0) PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  rg VARCHAR(9) UNIQUE,
  sexo CHAR(1) CHECK (sexo IN ('M','F')),
  idade NUMBER(*,0) CHECK (idade <= 80 AND idade >= 21),
  titulacao VARCHAR(12) CHECK (titulacao IN ('graduado','especialista','mestre','doutor')),
  categoria VARCHAR(10) CHECK (categoria IN ('auxiliar','assistente','adjunto','titular')), 
  nro_turma NUMBER(*,0) CHECK (nro_turma >= 0)
);
      
DROP TABLE professor;

INSERT INTO PROFESSOR (MATRICULA, NOME, RG, SEXO, IDADE, TITULACAO, CATEGORIA, NRO_TURMA) VALUES ('1', 'dfdfdf', '43438', 'M', '80', 'mestre', 'titular', '3'); 

CREATE TABLE curso(
  codigo NUMBER(*,0) PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  duracao NUMBER(2,0) CHECK (duracao <= 12 AND duracao >= 4),
  coordenador NUMBER REFERENCES professor(matricula)
);

INSERT INTO curso (codigo, nome, duracao, coordenador) VALUES (3, 'ADS', 11, 1);

CREATE TABLE disciplina(
  codigo NUMBER(*,0) PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  credito NUMBER CHECK (credito >= 2 AND credito <= 8)
);

INSERT INTO disciplina (codigo, nome, credito) VALUES (3, 'Teste', 5);

DROP TABLE disciplina;

CREATE TABLE curriculo(
  curso NUMERIC REFERENCES curso(codigo),
  disciplina NUMERIC REFERENCES disciplina(codigo),
  fase NUMERIC CHECK (fase >= 1 AND fase <= 12),
  CONSTRAINT curriculo_pk PRIMARY KEY(curso, disciplina)
);

INSERT INTO curriculo (curso, disciplina, fase) VALUES (1, 2, 5);

CREATE TABLE turma(
  codigo NUMERIC(*,0),
  disciplina NUMERIC REFERENCES disciplina(codigo),
  vagas NUMERIC(*,0) CHECK (vagas > 0),
  professor NUMERIC REFERENCES professor(matricula),
  CONSTRAINT turma_pk PRIMARY KEY(codigo, disciplina) 
);

DELETE FROM turma;
INSERT INTO turma (codigo, disciplina, vagas, professor) VALUES (4, 1, 30, 1);
UPDATE turma SET vagas=35 WHERE codigo=4 AND disciplina=1;
ROLLBACK;
COMMIT;