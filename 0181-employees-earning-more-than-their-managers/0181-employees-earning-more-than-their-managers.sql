# Write your MySQL query statement below
SELECT Name As Employee
FROM Employee e
WHERE e.Salary >
(SELECT Salary FROM Employee WHERE Id = e.ManagerId);