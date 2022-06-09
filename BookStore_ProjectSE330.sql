 -- drop  database BookStore_ProjectSE330
 -- create database BookStore_ProjectSE330;


use BookStore_ProjectSE330;
set dateformat dmy;



/*
DROP TABLE IF EXISTS "Manager";
DROP TABLE IF EXISTS "Customer";
DROP TABLE IF EXISTS "Author";
DROP TABLE IF EXISTS "Supplier";
DROP TABLE IF EXISTS "Publisher";
DROP TABLE IF EXISTS "Book";
DROP TABLE IF EXISTS "Discount";
DROP TABLE IF EXISTS "Book_Discount";
DROP TABLE IF EXISTS "Customer_Discount";
DROP TABLE IF EXISTS "Bill";
DROP TABLE IF EXISTS "Bill_Detail";
*/



Create table Manager
(

ManagerID int IDENTITY(1,1),
-- Manager ID int AUTO_INCREMENT,

Name nvarchar(30),
Phone varchar(10),
Email varchar(30),
constraint PK_Manager primary key(ManagerID)
)

Create table Customer
(
CustomerID int IDENTITY(1,1),
-- CustomerID int AUTO_INCREMENT,

Name nvarchar(30),
Phone varchar(10),
RegisterDate smalldatetime,
Total money,
constraint PK_Customer primary key(CustomerID)
)

Create table Author
(
AuthorID int IDENTITY(1,1),
-- AuthorID int AUTO_INCREMENT,

Name nvarchar(30),
NumofProducts smallint,
constraint PK_Author primary key(AuthorID)
)


Create table Supplier
(
SupplierID int IDENTITY(1,1),
-- SupplierID int AUTO_INCREMENT,

Name nvarchar(30),
Email varchar(30),
NumofProducts smallint,
constraint PK_Supplier primary key(SupplierID)
)

Create table Publisher(
PublisherID int IDENTITY(1,1),
-- PublisherID int AUTO_INCREMENT,

Name nvarchar(30),
Email varchar(30),
NumofProducts smallint,
constraint PK_Publisher primary key(PublisherID)
)

create table Book
(
BookID int IDENTITY(1,1),
-- BookID int AUTO_INCREMENT,

Supplier int,
Author int,
Publisher int,
Name nvarchar(30),
Description nvarchar(100),
Edition tinyint,
Type nvarchar(20),
BookCover nvarchar(20),
ReleaseDate smalldatetime,
NumPages tinyint,
Price money,
constraint PK_Book primary key(BookID)
)

Create table Discount(
DiscountID int IDENTITY(1,1),
-- DiscountID int AUTO_INCREMENT,

Name nvarchar(30),
Value numeric(2,2),
constraint PK_Discount primary key(DiscountID)

)

Create table Book_Discount(
BookID int ,
DiscountID int,
constraint PK_BookDiscount primary key(BookID, DiscountID)
)

Create table Customer_Discount(
CustomerID int ,
DiscountID int ,
constraint PK_CustomerDiscount primary key(CustomerID, DiscountID)
)	

Create table Bill(
BillID int IDENTITY(1,1),
-- BillID int AUTO_INCREMENT,

CustomerID int,
DiscountID int,
Address nvarchar(40),
Status varchar(20),
Total money,
Date smalldatetime,
constraint PK_Bill primary key(BillID)
)

Create table Bill_Detail
(
BillID int,
BookID int,
Amount tinyint,
Price money,
constraint PK_Bill_Detail primary key(BillID, BookID)
)



/* foreign key */

alter table Bill_Detail
ADD constraint FK_BDBI
foreign key(BillID) references Bill(BillID);

alter table Bill_Detail
ADD constraint FK_BDBKI
foreign key(BookID) references Book(BookID);

alter table Bill
ADD constraint FK_BDI
foreign key(DiscountID) references Discount(DiscountID);

alter table Bill
ADD constraint FK_BCI
foreign key(CustomerID) references Customer(CustomerID);

alter table Book
ADD constraint FK_BSI
foreign key(Supplier) references Supplier(SupplierID);

alter table Book
ADD constraint FK_BAI
foreign key(Author) references Author(AuthorID);

alter table Book
ADD constraint FK_BPI
foreign key(Publisher) references Publisher(PublisherID);

alter table Book_Discount
ADD constraint FK_BKDBI
foreign key(BookID) references Book(BookID);

alter table Book_Discount
ADD constraint FK_BKDDI
foreign key(DiscountID) references Discount(DiscountID);

alter table Customer_Discount
ADD constraint FK_CDCI
foreign key(CustomerID) references Customer(CustomerID);

alter table Customer_Discount
ADD constraint FK_CDDI
foreign key(DiscountID) references Discount(DiscountID);