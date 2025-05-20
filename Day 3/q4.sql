USE DAY3;

CREATE TABLE STUDENT(
	student_id INT,
    course_id INT,
    name VARCHAR(50),
    age INT,
    email VARCHAR(50),
    PRIMARY KEY (student_id,course_id)
);