create procedure RemoveRecord(@deptno int)
as
begin
delete from DEPT where DEPTNO=@deptno
end
go

exec RemoveRecord 50
select * from DEPT