Create database payroll;

create table employee (id serial primary key, name varchar, department varchar, salary decimal);

insert into employee(name,department,salary) values ('davoud', 'math', 20000);

insert into employee(name,department,salary) values (('ali'),('math'),('2000.5'::double precision))
