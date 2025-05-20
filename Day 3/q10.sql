USE DAY3;

CREATE TABLE temp1(
	student_id INT,
    course_id INT NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    date_of_birth DATE,
    email VARCHAR(50) UNIQUE,
    PRIMARY KEY (student_id,course_id)
);


CREATE TABLE temp2(
	student_id INT,
    course_id INT NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    date_of_birth DATE,
    email VARCHAR(50) UNIQUE,
    PRIMARY KEY (student_id,course_id)
);


DROP TABLE temp1;
DESCRIBE temp1;
-- temp1 will not show as whole structure will be deleted from memory location after DROP table 
TRUNCATE TABLE temp2;
DESCRIBE temp2;
-- temp2 will show the strcuture as it is still in memory location but all the data from rows will be lost and deleted it is comparatively fast then drop 


