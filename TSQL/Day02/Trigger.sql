CREATE TABLE Employee_Test
(
Emp_ID INT Identity,-- starts with one increments by 1
Emp_name Varchar(100),
Emp_Sal Decimal (10,2)
)
INSERT INTO Employee_Test VALUES ('Anees',1000);
INSERT INTO Employee_Test VALUES ('Rick',1200);
INSERT INTO Employee_Test VALUES ('John',1100);
INSERT INTO Employee_Test VALUES ('Stephen',1300);
INSERT INTO Employee_Test VALUES ('Maria',1400);

Select * from Employee_Test
CREATE TABLE Employee_Test_Audit
(
Emp_ID int,
Emp_name varchar(100),
Emp_Sal decimal (10,2),
Audit_Action varchar(100),
Audit_Timestamp datetime
)
Select * from Employee_Test_Audit

Create trigger trgAfter on Employee_Test
For insert,update,delete
as
	declare @empid int;
	declare @empName varchar(100);
	declare @empSal decimal(10,2);
	declare @audit_action varchar(100);
	if exists(SELECT * from inserted) and exists (SELECT * from deleted)
	begin
	select @empid=i.Emp_ID from inserted i;
	select @empName=i.Emp_name from inserted i;
	select @empSal=i.Emp_Sal from inserted i;
	set @audit_action='Record Updated after insert trigger';
	insert into Employee_Test_Audit
	values(@empid,@empName,@empSal,@audit_action,getdate());
	end
	If exists (Select * from inserted) and not exists(Select * from deleted)
	begin
	select @empid=i.Emp_ID from inserted i;
	select @empName=i.Emp_name from inserted i;
	select @empSal=i.Emp_Sal from inserted i;
	set @audit_action='Record inserted after update trigger';
	insert into Employee_Test_Audit
	values(@empid,@empName,@empSal,@audit_action,getdate());
	end
	If exists(select * from deleted) and not exists(Select * from inserted)
	begin
	select @empid=i.Emp_ID from deleted i;
	select @empName=i.Emp_name from deleted i;
	select @empSal=i.Emp_Sal from deleted i;
	set @audit_action='Record Deleted after delete trigger';
	insert into Employee_Test_Audit
	values(@empid,@empName,@empSal,@audit_action,getdate());
	end
go

insert into Employee_Test values('abc',1000)

Create trigger trgAfterDelete on Employee_Test
For delete
as
	declare @empid int;
	declare @empName varchar(100);
	declare @empSal decimal(10,2);
	declare @audit_action varchar(100);
	select @empid=i.Emp_ID from deleted i;
	select @empName=i.Emp_name from deleted i;
	select @empSal=i.Emp_Sal from deleted i;
	set @audit_action='Record Deleted after insert trigger';
	insert into Employee_Test_Audit
	values(@empid,@empName,@empSal,@audit_action,getdate());
go

delete from Employee_Test where Emp_ID=2

update  Employee_Test set Emp_name='Salman' where Emp_ID=8

create trigger trgInsteadofDelete on emp
instead of delete
as
	declare @empno int;
	declare @job varchar(100);
	select @job=i.job from deleted i;
	select @empno=i.empno from deleted i;
	Begin
		if(@job='President')
		begin
		Raiserror('President cannot be deleted',16,1);
		end
		else
		begin
			delete from emp where empno=@empno;
			Print 'Record Deleted'
		end
	end
go

delete from emp where EMPNO=7839
select * from emp

alter trigger trgInsteadofUpdate on emp
instead of update
as
	declare @empno int;
	declare @sal int;
	declare @new_sal int;
	select @sal=i.sal from inserted i;
	select @empno=i.empno from inserted i;
	Begin
		if(@sal>@new_sal)
		begin
		Raiserror('Salary cannot be updated',16,1);
		end
		else
		begin
			update emp set sal=@new_sal where empno=@empno;
			Print 'Salary Updated'
		end
	end
go

update emp set sal=1000 where EMPNO=7521