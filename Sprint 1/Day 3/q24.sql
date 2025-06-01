-- a)Retrieve all students from the Students table.

SELECT * FROM students;

-- b)display only the FirstName and Email of all students.

SELECT firstname,email FROM students;

-- c)List all courses with exactly 4 credits

SELECT * FROM COURSES
WHERE credits = 4;

-- d)Show all students born after January 1, 2000.

SELECT * FROM students
WHERE dateofbirth > 2000-01-01;

-- e)Find the number of students enrolled in each course.

SELECT courseid , COUNT(studentid)
FROM enrollments
GROUP BY courseid;

-- f)Display students and their enrollment dates.

SELECT firstname,EnrollmentDate
FROM students
INNER JOIN enrollments 
ON students.studentid = enrollments.studentid;

-- g)List unique course IDs from the Enrollments table.

SELECT DISTINCT courseid
FROM courses;

-- h)Find all students who are enrolled in CourseID 102.

SELECT students.firstname , courses.courseid
FROM Courses
INNER JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
INNER JOIN students
on enrollments.studentid = students.studentid
WHERE courses.courseid = 102;

-- i)Display students ordered by LastName alphabetically.

SELECT * FROM students
ORDER BY lastname DESC;

-- j)List all students who have not enrolled in any course.

SELECT students.firstname
FROM Courses
INNER JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
RIGHT JOIN students
on enrollments.studentid = students.studentid
WHERE courses.courseid IS NULL;

-- k)Show the average number of credits across all courses.

SELECT courseid, ROUND(AVG(CREDITS),2) FROM COURSES
GROUP BY courseid;

-- l)List the top 3 most recently enrolled students.

SELECT * FROM students 
ORDER BY dateofbirth DESC
LIMIT 3;

-- m)Find all courses with names containing the word 'Data'.

SELECT * FROM courses
WHERE CourseName LIKE "%Data%";

-- n)Display the youngest student in the database.

SELECT * 
FROM students
ORDER BY dateofbirth DESC
LIMIT 1;

-- o)Count the number of students with the same last name.


SELECT lastname, COUNT(*) as same
FROM students
GROUP BY lastname
HAVING same > 1;

-- p)List courses along with the total number of enrolled students, sorted by count descending.

select courses.courseid,count(*) as totalstudent
FROM courses
LEFT JOIN enrollments
ON courses.courseid = enrollments.courseid
GROUP BY courses.courseid
ORDER BY totalstudent DESC;

-- q)Find students who share the same first name.

SELECT firstname, COUNT(*) as same
FROM students
GROUP BY firstname
HAVING same > 1;

 -- r)Display enrollments made in the current year.
 
SELECT * FROM enrollments
WHERE YEAR(enrollmentdate) = YEAR(CURDATE());

-- s)List students along with the names of the courses they are enrolled in.

SELECT students.firstname, courses.coursename
FROM Courses
INNER JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
RIGHT JOIN students
on enrollments.studentid = students.studentid;




