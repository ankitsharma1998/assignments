use jpahibernatedb;
Drop table payment;

employeeTablecreate table employeeTable(
	empId int primary key auto_increment,
    empFirstName varchar(10),
    empLastName varchar(10),
    empSalary double,
    empAge int
);

/*================ tables for Single Table strategy.. =====================*/
create table payment(
id int PRIMARY KEY,
pmode varchar(2),
amount decimal,
cardnumber varchar(25),
checknumber varchar(25)
);

create table card(
id int PRIMARY KEY,
amount decimal(8,3),
cardnumber varchar(20)
);

create table bankcheck(
id int PRIMARY KEY,
amount decimal(8,3),
checknumber varchar(20)
)
drop table payment;
select * from payment;
/*================ tables for Table Per Class strategy. =====================*/
create table payment(
id int PRIMARY KEY,
pmode varchar(2),
amount decimal,
cardnumber varchar(25),
checknumber varchar(25)
);

create table card(
id int PRIMARY KEY,
amount decimal(8,3),
cardnumber varchar(20)
);

create table bankcheck(
id int PRIMARY KEY,
amount decimal(8,3),
checknumber varchar(20)
)

/*================ tables for Joined strategy.. =====================*/
drop table card;
drop table bankcheck;
drop table payment;

create table payment(
id int PRIMARY KEY,
amount decimal(8,3)
);

create table card(
id int ,
cardnumber varchar(20),
 FOREIGN KEY (id)
REFERENCES payment(id)
);

create table bankcheck(
id int ,
checknumber varchar(20),
FOREIGN KEY (id)
REFERENCES payment(id)
)



/* ================Emoloyee Mapping =========================*/

create table employeemapping(
id int,
firstname varchar(20),
lastname varchar(20),
age int,
basicsalary double,
bonussalary double,
taxamount double,
specialallowancesalary double
)