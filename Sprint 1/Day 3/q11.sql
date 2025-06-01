USE DAY3;

ALTER TABLE studentDetails
ADD comments VARCHAR(50);

ALTER TABLE studentDetails 
DROP COLUMN comments; 