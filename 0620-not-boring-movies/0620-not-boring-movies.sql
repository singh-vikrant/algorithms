# Write your MySQL query statement below
select * from cinema where id % 2 = 1 and description NOT LIKE 'boring' order by rating desc