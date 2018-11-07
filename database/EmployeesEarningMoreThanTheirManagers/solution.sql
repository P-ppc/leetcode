# Write your MySQL query statement below
select l.Name as Employee from Employee as l
    join Employee as r
    on l.ManagerId = r.Id and l.Salary > r.Salary