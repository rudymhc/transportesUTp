--drop database if exists dbprueba;
create database dbprueba;
	use dbprueba;



create table empleado(
idEmpleado int not null auto_increment,
nombres varchar(50) not null,
apellidos varchar(70) not null,
username varchar(50) not null,
password varchar(50) not null,
docIdentidad int(10) not null,
nacionalidad varchar(20) not null,
nroContacto int(9) null,
nroLicencia varchar(10)null,
primary key (idEmpleado)
);

delimiter $$
create procedure sp_insertar_empleado(
in p_nombres varchar(50),
in p_apellidos varchar(50),
in p_username varchar(50),
in p_password varchar(50),
in p_docIdentidad int(8),
in p_nacionalidad varchar(50),
in p_nroContacto int(9),
in p_nroLicencia varchar(10)
)
begin
insert into empleado(nombres,apellidos,username,password,docIdentidad,nacionalidad,nroContacto,nroLicencia)values
	(p_nombres,p_apellidos,p_username,p_password,p_docIdentidad,p_nacionalidad,p_nroContacto,p_nroLicencia);
end$$

delimiter $$
create procedure sp_listar()
begin
select id, nombres,apellidos,username,password,docIdentidad,docIdentidad,nacionalidad,nroContacto,nroLicencia from empleado;
end$$

delimiter $$
create procedure sp_login(
in p_username varchar(50),
in p_password varchar(50)
)
begin
select * from empleado where username = p_username and password = p_password;
end $$



call sp_insertar_empleado('Luis','Romero','allegro','allegro','12345678','Peruano','986885844','12345678');

call sp_listar();