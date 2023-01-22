# Creating DOCTOR_RECORD table with DOCTOR_ID as a Primary Key


DROP DATABASE IF EXISTS pams;

CREATE DATABASE pams;

USE PAMS;
SHOW TABLES;

DROP TABLE IF EXISTS DOCTOR_RECORD;

CREATE TABLE DOCTOR_RECORD
(

DOCTOR_ID INT AUTO_INCREMENT,
DOCTOR_NAME varchar(20),
TOTAL_EXPERIENCE INT,
CONSULTING_CHARGE INT,
EDUCATION_DEGREE VARCHAR (20),
SPECIALITY VARCHAR(25), 

CONSTRAINT PRIMARY KEY(DOCTOR_ID)
);




-- DROP TABLE TIME_SLOT;

-- CREATE TABLE PAMS.TIME_SLOT
-- (

-- DOCTOR_ID INT,
-- START_TIME INT,
-- END_TIME INT,
-- DOCTOR_ID INT,
--     
-- CONSTRAINT FOREIGN KEY (DOCTOR_ID)
--  )

-- CONSULTING_TIME ENUM("10.00 AM", "10.30 AM", "11.00 AM", "11.30 AM", "12.00 AM", "12.30 PM"),