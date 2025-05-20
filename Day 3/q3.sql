USE DAY3;

CREATE TABLE employee (
    employee_id INT PRIMARY KEY ,
    name VARCHAR(50),
    age INT ,
    phone_number VARCHAR(15)
);

CREATE TABLE salary (
	salary_id INT PRIMARY KEY,
	employee_id INT,
    department VARCHAR(50),
    basic_salary DOUBLE(10,3),
    job_title VARCHAR(50),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

