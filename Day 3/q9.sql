USE DAY3;

CREATE TABLE studentDetails(
	student_id INT,
    course_id INT NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    date_of_birth DATE,
    email VARCHAR(50) UNIQUE,
    PRIMARY KEY (student_id,course_id)
);
