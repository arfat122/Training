create procedure EmpMgr(@no int)
as
begin
declare @name varchar(10)
select @name=ename from emp where mgr=@no
print @name
end 
go
 
exec EmpMgr 7902