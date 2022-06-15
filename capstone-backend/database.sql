create database db;
create table admin(username varchar(20),password varchar(20));
create table customers(name varchar(20),address varchar(20),pincode int, phonenumber double,typeofproblem varchar(20),status varchar(20));
create table managers(name varchar(20),age int,address varchar(20),phonenumber double,area varchar(20),salary int,timings varchar(20));
create table engineers(name varchar(20),age int,address varchar(20),phonenumber double,area varchar(20),salary int,timings varchar(20));
create table customercomplaint(name varchar(20),address varchar(20),pincode int, phonenumber double,typeofproblem varchar(20));
create table customerlogins(username varchar(20),password varchar(20));
create table managerlogins(username varchar(20),password varchar(20));
create table engineerlogins(username varchar(20),password varchar(20));
create table assignengineer(name varchar(20),address varchar(20),pincode int, phonenumber double,typeofproblem varchar(20),status varchar(20),engineer varchar(20));
insert into admin values('admin','admin@123');
insert into admin values(null,null);

insert into customers values('sreekar','nacharam',500076,9618775349,'voice breaking','NOT RESOLVED');


insert into customercomplaint values('sreekar','nacharam',500076,9618775349,'voice breaking');


insert into customerlogins values('virat','virat123');
insert into customerlogins values('sreekar','sreekar123');

insert into managerlogins values('rohit','rohit123');

insert into engineerlogins values('rahul','rahul123');

insert into assignengineer values('sreekar','nacharam',500076,9618775349,'voice breaking','NOT RESOLVED','NOT ASSIGNED');
insert into assignengineer values('virat','attapur',500048,9949246555,'low sound','NOT RESOLVED','Gaurav');
insert into assignengineer values('rohit','vidyanagar',500012,9959638654,'disturbance','RESOLVED','NOT ASSIGNED');


insert into managers values('ganesh',45,'hyderabad',7986876758,'banjara hills',50000,'9am-5pm');
insert into managers values('sourav',38,'hyderabad',6345763731,'punjagutta',40000,'10am-5pm');



insert into engineers values('arun',23,'chennai',9876654554,'kempoguda',30000,'8am-10pm');
insert into engineers values('rishab',24,'delhi',7836466554,'green hills',23000,'8am-10pm');
insert into engineers values('ruturaj',27,'hyderabad',7895437896,'jubilee hills',35000,'8am-10pm');