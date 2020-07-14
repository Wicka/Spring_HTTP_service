
DROP table IF EXISTS empleados;

create table empleados(
	id int auto_increment,
	nombre varchar(250),
	cargo varchar(250),
	salario int (11)	
);

insert into empleados (nombre, cargo, salario)values('David','Chief_Officer', 0);
insert into empleados (nombre, cargo, salario)values('Ester','Master', 0);
insert into empleados (nombre, cargo, salario)values('Gloria','Second_Officer', 0);
insert into empleados (nombre, cargo, salario)values('Emma','Boatswain', 0);
insert into empleados (nombre, cargo, salario)values('Montse','Chief_Engineer', 0);
insert into empleados (nombre, cargo, salario)values('Albert','Machinist', 0);
insert into empleados (nombre, cargo, salario)values('Myrna','Stewards', 0);
