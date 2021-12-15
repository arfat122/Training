create procedure GetEmpDetailsbyEmpno(@empno int)
as
begin
select empno,ENAME, job,deptno from emp where empno=@empno
end



exec GetEmpDetailsbyEmpno 7499