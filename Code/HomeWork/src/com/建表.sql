USE test
CREATE TABLE employee(
	employeeId VARCHAR(18) PRIMARY KEY,
	employeeName VARCHAR(18),
	employeeType VARCHAR(18),
	`status` VARCHAR(18)
)
DROP TABLE employee
SELECT * FROM employee