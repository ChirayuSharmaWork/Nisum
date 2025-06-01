-- COUNT 

SELECT designation,count(employeeid) 
FROM employee
GROUP BY designation;

SELECT credits, COUNT(coursename) AS total
FROM course
GROUP BY credits
HAVING total > 11;

-- SUM

SELECT SUM(basesalary)
FROM salary;

