CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Email VARCHAR(100)
);

CREATE TABLE Courses (
    CourseID INT PRIMARY KEY,
    CourseName VARCHAR(100),
    Credits INT
);

CREATE TABLE Enrollments (
    EnrollmentID INT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    EnrollmentDate DATE,
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);

INSERT INTO Students (StudentID, FirstName, LastName, DateOfBirth, Email) VALUES
(1, 'Alice', 'Johnson', '2002-01-15', 'alice.johnson@example.com'),
(2, 'Bob', 'Smith', '2001-03-22', 'bob.smith@example.com'),
(3, 'Charlie', 'Brown', '2000-11-05', 'charlie.brown@example.com'),
(4, 'David', 'Wilson', '2002-07-08', 'david.wilson@example.com'),
(5, 'Eve', 'Davis', '2001-12-25', 'eve.davis@example.com'),
(6, 'Frank', 'Garcia', '2000-08-16', 'frank.garcia@example.com'),
(7, 'Grace', 'Martinez', '2003-02-12', 'grace.martinez@example.com'),
(8, 'Henry', 'Anderson', '2001-10-01', 'henry.anderson@example.com'),
(9, 'Ivy', 'Thomas', '2002-04-20', 'ivy.thomas@example.com'),
(10, 'Jack', 'Moore', '2000-06-18', 'jack.moore@example.com'),
(11, 'Karen', 'Martin', '2002-11-30', 'karen.martin@example.com'),
(12, 'Leo', 'Jackson', '2001-09-12', 'leo.jackson@example.com'),
(13, 'Mia', 'White', '2000-05-19', 'mia.white@example.com'),
(14, 'Nate', 'Harris', '2003-03-28', 'nate.harris@example.com'),
(15, 'Olivia', 'Clark', '2002-01-07', 'olivia.clark@example.com'),
(16, 'Peter', 'Lewis', '2001-07-23', 'peter.lewis@example.com'),
(17, 'Quinn', 'Walker', '2000-10-05', 'quinn.walker@example.com'),
(18, 'Rachel', 'Hall', '2003-06-14', 'rachel.hall@example.com'),
(19, 'Sam', 'Allen', '2002-08-09', 'sam.allen@example.com'),
(20, 'Tina', 'Young', '2001-05-02', 'tina.young@example.com'),
(21, 'Uma', 'King', '2000-04-11', 'uma.king@example.com'),
(22, 'Victor', 'Wright', '2002-09-17', 'victor.wright@example.com'),
(23, 'Wendy', 'Scott', '2003-01-30', 'wendy.scott@example.com'),
(24, 'Xander', 'Green', '2001-11-19', 'xander.green@example.com'),
(25, 'Yara', 'Baker', '2000-12-12', 'yara.baker@example.com');

INSERT INTO Courses (CourseID, CourseName, Credits) VALUES
(101, 'Mathematics', 4),
(102, 'Physics', 4),
(103, 'Chemistry', 3),
(104, 'Biology', 3),
(105, 'Computer Science', 5),
(106, 'English Literature', 2),
(107, 'History', 3),
(108, 'Philosophy', 3),
(109, 'Economics', 4),
(110, 'Data Structures', 4);

INSERT INTO Enrollments (EnrollmentID, StudentID, CourseID, EnrollmentDate) VALUES
(1, 1, 101, '2024-06-01'),
(2, 2, 102, '2024-06-02'),
(3, 3, 103, '2024-06-03'),
(4, 4, 104, '2024-06-04'),
(5, 5, 105, '2024-06-05'),
(6, 6, 106, '2024-06-06'),
(7, 7, 107, '2024-06-07'),
(8, 8, 108, '2024-06-08'),
(9, 9, 109, '2024-06-09'),
(10, 10, 110, '2024-06-10'),
(11, 1, 102, '2024-06-11'),
(12, 2, 103, '2024-06-12'),
(13, 3, 104, '2024-06-13'),
(14, 4, 105, '2024-06-14'),
(15, 5, 106, '2024-06-15'),
(16, 6, 107, '2024-06-16'),
(17, 7, 108, '2024-06-17'),
(18, 8, 109, '2024-06-18'),
(19, 9, 110, '2024-06-19'),
(20, 10, 101, '2024-06-20'),
(21, 11, 101, '2024-06-21'),
(22, 12, 102, '2024-06-22'),
(23, 13, 103, '2024-06-23'),
(24, 14, 104, '2024-06-24'),
(25, 15, 105, '2024-06-25'),
(26, 16, 106, '2024-06-26'),
(27, 17, 107, '2024-06-27'),
(28, 18, 108, '2024-06-28'),
(29, 19, 109, '2024-06-29'),
(30, 20, 110, '2024-06-30');

