
DROP table IF EXISTS empleados;

create table empleados(
	id int auto_increment,
	nombre varchar(250),
	feina varchar(250)	
);

insert into empleados (nombre, feina)values('Ester','programadora');
insert into empleados (nombre, feina)values('Jose','master');
insert into empleados (nombre, feina)values('Nuria','programadora');
insert into empleados (nombre, feina)values('Gloria','analista');
insert into empleados (nombre, feina)values('Montse','desarroladora');