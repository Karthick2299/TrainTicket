select * from traindetails;

insert into ticket values('Mani@123',12395,42176601,'Sleeper','02/08/2022',195,(PNR.nextval),'ticket approved','katpadi junction','egmore',timestamp '2022-08-20 10:00:00',timestamp '2022-08-20 11:45:00');



insert into traindetails values(12345,'pandian express','MAS','MDU','02/08/2022 10:00:00 am','02/08/2022 10:00:00 pm');
select * from users;


create table Users(
User_Id varchar2(20) Not Null primary key,
User_password varchar2(100) Not Null,
User_Name varchar2(50) Not Null, 
Date_of_Birth Date Not Null,
gender  varchar2(10) Not Null ,
Mail_Id  varchar2(100) Not Null,
Phone_numbet number(10) Not Null,
address varchar2(200) Not  Null,
Nationality varchar2(100));
--------------------------------------

Create table stations( 
Station_Id varchar(20) primary key,
  station_name VARCHAR2(100),
  station_address  VARCHAR2(100));
  
  select * from stations;
  insert into stations values('CBE','Coimbatore Junction','coimbatore');
  commit;
 -------------------------------------- 
create table traindetails(
 Train_No int Not Null primary key,
 Train_Name varchar2(100), 
 Start_place  varchar2(100)constraint fk_station_source references stations(Station_Id) not null ,
 destination varchar2(100) not null constraint fk_station_destination references stations(Station_Id) on delete cascade,
 Arrival_Time timestamp,
 Departure_time timestamp);
 
 insert into traindetails values(15598,'chennai superfast express','KPD','MDU','04/08/2022 10:35:00 am','04/08/2022 07:35:00');
 
 select * from TrainDetails;
 commit;
 ------------------------------------
create table Ticket_fare(
Train_No int not null CONSTRAINT fk_Train_No references TrainDetails(Train_No),
Max_Seats number(25),
Seat_Class  varchar2(100),
Fare int not null,
constraint pk_TrainNo primary key(Train_No,Seat_Class));

insert into Ticket_fare values (15595,10,'sleeper',400);
insert into Ticket_fare values (15595,10,'2s',350);
insert into Ticket_fare values (12345,10,'2s',200);
select * from Ticket_fare;
commit;
 
 -------------------------------------
create table Ticket(
user_id varchar2(100) not null CONSTRAINT fk_User_Id REFERENCES Users(User_Id) ,
Train_no int not null CONSTRAINT fk_TrainNo references TrainDetails(Train_No),
Ticket_No number(12) not null primary key,
Seat_Class varchar2(100) not null,
Travelling_date Date not null,
Amount integer not null,
PNR number(10) ,
status varchar2(100) not null,
Boarding_Station varchar2(100)not null,
Destination_Station varchar2(100)not null,
Boarding_Time timestamp ,
Arrival_Time  Timestamp);

select * from Ticket;

create sequence PNR
start with 123456
increment by 2;

insert into ticket values ('Mani@123',15595,11000,'sleeper',to_date('08-11-2022','mm/dd/yyyy'),350,PNR.nextval,'Ticket Booked','KPD','MDU','08/11/2022 09:00:00 am','08/11/2022 06:00:00 pm');
insert into ticket values ('jerry@123',12345,165658,'2s','15/08/2022',200,PNR.nextval,'Ticket Booked','MAS','MDU','15/08/2022 09:00:00 am','15/08/2022 05:00:00 pm');

-------------------------------------
create table TicketDetails(
Ticket_No number(12)constraint fk_ticket_details references ticket(Ticket_No) not null ,
seat_no  integer not null,
passengername varchar2(100) not null,
Date_Of_Birth Date Not null,
Gender varchar2(10) not null,
Nationality varchar2(20),
constraint pk_ticketNo_passname primary key(Ticket_No,passengername));
commit;

select * from TicketDetails;

drop table TicketDetails; 

insert into TicketDetails values (11000,08,'Manigandan','08-11-2000','Male','Indian');
insert into TicketDetails values (165658,12,'Jerry','15/08/1999','Female','Indian');


select * from paymentdetails;
------------------------------------
create table PaymentDetails(
 Ticket_No number(12)constraint fk_ticket_payment references ticket(Ticket_No) not null ,
 User_Id varchar2(100)constraint fk_user_payment REFERENCES Users(User_Id)not null,
 Receipt_No varchar2(100) not null,
 Amount int not null,
 Mode_Of_Payment varchar2(10) not null,
 Payment_Details varchar2(200) not null,
 Payment_Date Date not null,
 constraint pk_user primary key(Ticket_No,User_Id));
 
 
 insert into PaymentDetails values(11000,'Mani@123','1N0979572',350,'Online','Transaction Completed','10/11/2022');
 insert into PaymentDetails values(165658,'jerry@123','1SM9534',200,'Online','Transaction Completed','12/08/2022');
 
 
