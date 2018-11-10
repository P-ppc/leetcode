# Write your MySQL query statement below
select s.Score, 
    (select count(distinct Score) from Scores where Score >= s.Score) as Rank 
from Scores as s order by Score desc