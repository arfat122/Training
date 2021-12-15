create procedure AddNewDeptDetails(@deptno int,@dname varchar(15),@loc varchar(15))
as
begin
insert into dept values(@deptno,@dname,@loc)
end
go

exec AddNewDeptDetails 50,'Admin','BLR'

select * from DEPT