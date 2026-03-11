# Write your MySQL query statement below
select email AS Email
from Person
Group by email 
Having count(email)>1;