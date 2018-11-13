# Write your MySQL query statement below
select d.Name as Department, e.Name as Employee, Salary
from Employee as e, Department as d
where e.DepartmentId = d.Id and Salary = (select max(Salary) from Employee where DepartmentId = d.Id)