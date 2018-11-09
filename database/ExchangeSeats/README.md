# Exchange Seats
We can solve problem this problem by CASE function, or use union to solve it like below:
```sql
# Write your MySQL query statement below
select id, student from (
    select id - 1 as id, student from seat where mod(id, 2) = 0 union
    select id + 1 as id, student from seat where mod(id, 2) = 1 and id != (select count(*) from seat) union
    select id, student from seat where mod(id, 2) = 1 and id = (select count(*) from seat)
) as s order by id
```