USE DAY3;

DELETE FROM studendetails
WHERE studentid = 2;

SELECT * FROM studendetails;


CREATE TABLE TEMP1 (
	name VARCHAR(50),
    id INT,
	ADDRESS VARCHAR(100),
    salary INT,
    PRIMARY KEY (id)
);


INSERT INTO TEMP1 VALUES 
("test",1,"testing testing",1000),
("test2",2,"testing 2 testing",2000)
;

TRUNCATE TABLE TEMP1;

SELECT * FROM temp1;

DROP TABLE TEMP1;

SELECT * FROM temp1;

