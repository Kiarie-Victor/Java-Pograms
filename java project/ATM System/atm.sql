-- CREATING THE DATABASE
CREATE DATABASE atm;
-- SELECTING THE DATABASE
USE atm;
-- CREATE USERS TABLE
CREATE TABLE users(
id int primary key auto_increment, 
card varchar(16), pin varchar(4), 
uname varchar(25), bal int);
-- CREATE TRANSACTION TABLE
CREATE TABLE transactions(
transid int primary key auto_increment, 
id int, amount int, stat varchar(3), bal int);
-- CREATING AN ADMIN USER
INSERT INTO users VALUES(1, "admin", "1234", "admin", 0);

