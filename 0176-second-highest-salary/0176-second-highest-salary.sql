# Write your MySQL query statement below

#Select max(Salary) as SecondHighestSalary from Employee where salary <(Select max(Salary) from Employee);
 
Select (Select distinct Salary from Employee order by salary Desc limit 1,1) as SecondHighestSalary;