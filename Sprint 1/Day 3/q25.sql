-- a)List all students along with the courses they are enrolled in.

SELECT students.firstname, courses.coursename
FROM Courses
INNER JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
INNER JOIN students
on enrollments.studentid = students.studentid;

-- b)List all courses and the students enrolled in them (include courses with no enrollments).

SELECT students.firstname, courses.coursename
FROM Courses
LEFT JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
LEFT JOIN students
on enrollments.studentid = students.studentid;

-- c)Show all students who have not enrolled in any course.

SELECT students.firstname, courses.coursename
FROM Courses
LEFT JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
LEFT JOIN students
on enrollments.studentid = students.studentid
WHERE courses.coursename is NULL;

-- d)List course names along with the count of enrolled students using JOIN.

select courses.courseid,count(*) as totalstudent
FROM courses
LEFT JOIN enrollments
ON courses.courseid = enrollments.courseid
GROUP BY courses.courseid;

-- e)Show each student's full name and all course names they are enrolled in, ordered by student name:

SELECT students.firstname, students.lastname , courses.coursename
FROM Courses
INNER JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
INNER JOIN students
on enrollments.studentid = students.studentid
ORDER BY students.firstname,students.lastname;

-- f)List students and enrollment details using INNER JOIN.

SELECT *
FROM students
INNER JOIN enrollments
ON students.studentid = enrollments.studentid;

-- g)List all courses with student names using LEFT JOIN.

SELECT students.firstname, courses.coursename
FROM Courses
LEFT JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
LEFT JOIN students
on enrollments.studentid = students.studentid;

-- List student names and their course names using RIGHT JOIN

SELECT students.firstname, courses.coursename
FROM Courses
INNER JOIN enrollments
ON Courses.CourseID = enrollments.CourseID
RIGHT JOIN students
on enrollments.studentid = students.studentid;

-- j)Find students who are enrolled in both 'Database Systems' and 'Data Structures'.

SELECT DISTINCT s.StudentID, s.FirstName, s.LastName
FROM Students s
JOIN Enrollments e ON s.StudentID = e.StudentID
JOIN Courses c ON e.CourseID = c.CourseID
WHERE c.CourseName IN ('Database Systems', 'Data Structures')
GROUP BY s.StudentID, s.FirstName, s.LastName
HAVING COUNT(DISTINCT c.CourseName) = 2;

