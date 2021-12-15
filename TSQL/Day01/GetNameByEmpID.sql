create procedure GetNameByEmpID(@No int)
as
begin
declare @name varchar(10)
select @name=ename from emp where EMPNO=@No
print @name
end 

exec GetNameByEmpID 7521