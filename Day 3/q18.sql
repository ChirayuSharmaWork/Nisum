-- 1 

SELECT studentid from studendetails;

-- 2

SELECT collegeid,studentid,email FROM studendetails;

-- 3

SELECT * FROM studendetails;

-- 4

SELECT *
FROM studendetails 
WHERE studentid = 5;

-- 5

SELECT * 
FROM studendetails
ORDER BY email;

-- 6

SELECT *
FROM studendetails
LIMIT 10;

-- 7

SELECT *
FROM studendetails
WHERE studentid BETWEEN 12 AND 19 
AND collegeid BETWEEN 13 AND 15;

-- 8

SELECT *
FROM studendetails
WHERE studentid IN (14,15,16);

-- 9

SELECT *
FROM studendetails
WHERE email LIKE "%gmail.com";






