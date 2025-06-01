CREATE TABLE students (
	studentid INT,
    name VARCHAR(50),
    age INT,
    PRIMARY KEY (studentid)
);

CREATE TABLE courses (
	courseid INT,
    coursename VARCHAR(50),
	PRIMARY KEY (courseid)
    
);

CREATE TABLE enrollments (
	enrollmentid INT,
	studentid INT,
	courseid INT,
	PRIMARY KEY (enrollmentid),
    FOREIGN KEY (studentid) REFERENCES students(studentid),
    FOREIGN KEY (courseid) REFERENCES courses(courseid)

);
INSERT INTO students VALUES 
	(1,"Alice",20),
	(2,"Bob",21),
	(3,"Charlie",22),
	(4,"David",23),
	(5,"Eve",23);

INSERT INTO courses VALUES 
	(101,"Math"),
	(102,"Physics"),
	(103,"Chemistry"),
	(104,"Computer Science");

INSERT INTO Enrollments VALUES
	(1,1,101),
	(2,1,104),
	(3,2,102),
	(4,3,103),
	(5,4,104);

SELECT * 
FROM students 
lEFT JOIN Enrollments
ON students.studentid = Enrollments.studentid;

SELECT * 
FROM students 
INNER JOIN Enrollments
ON students.studentid = Enrollments.studentid;

SELECT * 
FROM students 
RIGHT JOIN Enrollments
ON students.studentid = Enrollments.studentid;

SELECT * 
FROM students 
INNER JOIN Enrollments
ON students.studentid = Enrollments.studentid 
INNER JOIN COURSES
ON enrollments.courseid = courses.courseid
;


