CREATE TABLE employeetemp(
	empid INT,
    name VARCHAR(50),
    age INT,
    dept VARCHAR(50),
    salary INT,
    PRIMARY KEY (empid)
);

INSERT INTO employeetemp
VALUES 
(1,"Alice",30,"HR",50000),
(2,"Bob",28,"IT",60000),
(3,"Charlie",35,"Finance",70000),
(4,"David",40,"IT",80000),
(5,"Eve",25,"HR",55000),
(6,"Frank",33,"Finance",75000),
(7,"Grace",29,"IT",62000)
;


-- Find the employees whose salary is greater than the average salary.

SELECT name, salary 
FROM employeetemp
WHERE salary > (SELECT AVG(salary) FROM employeetemp);

-- List the names of employees who earn the maximum salary.

SELECT name
FROM employeetemp
WHERE SALARY = (SELECT MAX(salary) FROM employeetemp);
