CREATE DATABASE sw;

use sw;

CREATE TABLE Cliente(
	codigo 		  INT AUTO_INCREMENT PRIMARY KEY,
	razao_social  VARCHAR(100),
	nome_fantasia VARCHAR(100),
	cnpj_cpf      VARCHAR(14),
	telefone      VARCHAR(30)
	status        VARCHAR(1)
);
