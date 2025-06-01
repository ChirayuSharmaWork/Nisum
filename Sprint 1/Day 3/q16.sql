USE DAY3;


-- UPSERT = UPDATE + INSERT 

INSERT INTO studendetails 
VALUES (3,3,5,"update@gmail.com","updatedagain")
ON DUPLICATE KEY UPDATE
	studentid = VALUES(studentid),
    collegeid = VALUES(collegeid),
    courseid  = VALUES(courseid),
    email  = VALUES(email),
    firstname  = VALUES(firstname)
;

    
-- REPLACE = DELETE + INSERT

REPLACE INTO studendetails values (3,3,7,"update@gmail.com","updatedagain");

