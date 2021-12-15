DECLARE @Whileloop INT
SET @Whileloop=1

WHILE @Whileloop<=100
BEGIN
SELECT @Whileloop AS NUM
SET @Whileloop=@Whileloop+1
END