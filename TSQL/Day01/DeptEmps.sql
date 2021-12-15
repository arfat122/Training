create procedure DeptEmp(@deptno int)
as
begin
declare @name varchar(10)
select @name=ename from emp where DEPTNO=@deptno
print @name
end 
go

exec DeptEmp 10