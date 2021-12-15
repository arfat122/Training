create procedure AnnualSal(@No int)
as
begin
declare @name varchar(10)
select @name=job from emp where EMPNO=@No
print @name
end 

exec AnnualSal 7521