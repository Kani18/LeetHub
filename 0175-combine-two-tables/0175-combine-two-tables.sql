# Write your MySQL query statement below



select p.lastName ,p.firstName ,a.city ,a.state 
from Person p left join Address a ON p.personId =a.personId;