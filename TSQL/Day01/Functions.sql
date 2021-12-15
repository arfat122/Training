create function AddTwoNum(@num1 int,@num2 int)
returns int
as
begin 
return @num1+@num2
end


select dbo.AddTwoNum(1,2)

select ename,sal,comm,dbo.AddTwoNum(sal,comm) totalsal from emp


create function  Sal(@empno int)
returns int
as
begin
return (select sal*12 from emp where EMPNO=@empno)
end

select dbo.Sal(7499)
select * from emp

create function  HighestSalaryInDept(@deptno int)
returns table
as
return (select top (1) * from emp where DEPTNO=@deptno order by Sal DESC);

Select * from HighestSalaryInDept(10)