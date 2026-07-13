# Write your MySQL query statement below
select EMP.name as Employee From Employee Emp,Employee MGR
where EMp.managerId=MGR.id and EMP.salary>MGR.salary