# Write your MySQL query statement below
select distinct l.Num as ConsecutiveNums from Logs as l
join Logs as r
on l.Id + 1 = r.Id and l.Num = r.Num
join Logs as r2
on r.Id + 1 = r2.Id and r.Num = r2.Num