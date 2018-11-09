# Write your MySQL query statement below
select (
    case 
    when mod(id, 2) = 1 and id = counts then id
    when mod(id, 2) = 1 and id < counts then id + 1
    else id - 1
    end) as id, student from seat, (select count(*) as counts from seat) as seat_counts order by id