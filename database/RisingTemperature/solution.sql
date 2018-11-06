# Write your MySQL query statement below
select l.Id from Weather as l 
    join Weather as r 
    on DATEDIFF(l.RecordDate, r.RecordDate) = 1 and l.Temperature > r.Temperature