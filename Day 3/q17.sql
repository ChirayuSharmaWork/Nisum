CREATE TABLE studentdetails(
	studentid INT,
    collegeid INT,
    courseid INT NOT NULL,
    email VARCHAR(100) UNIQUE,
    firstname VARCHAR(50),
    PRIMARY KEY(studentid , collegeid),
    FOREIGN KEY (courseid) REFERENCES course(courseid)
);

CREATE TABLE course(
	courseid INT,
    coursename VARCHAR(100),
    credits INT,
    PRIMARY KEY (courseid)
);

CREATE TABLE department(
	department_id INT,
    college_id INT,
    PRIMARY KEY (department_id),
    FOREIGN KEY (college_id) REFERENCES studentdetails(collegeid)

);