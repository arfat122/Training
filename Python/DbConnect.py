import cursor as cursor
import pyodbc
pyodbc.drivers()
cnxn_string='Driver={SQL Server};SERVER=BG1NB1178;Database=Training;UID=Admin;PWD=admin'
cnxn = pyodbc.connect(cnxn_string)
cursor=cnxn.cursor()
sql="Select * from emp"
cursor.execute(sql)
res=cursor.fetchall()
for i in res:
    print(res)
cursor.close()
cnxn.close()
