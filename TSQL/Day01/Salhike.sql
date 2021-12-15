alter procedure Salhike(@empno int,@sal int)
as
begin
update emp set SAL=@sal where EMPNO=@empno
end
go

select * from emp

exec Salhike 7369,150