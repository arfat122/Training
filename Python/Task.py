class Task:
    def __init__(self,tname,tdesc,tstatus,tpriority,tnotes,tbm,townid,tcrid,crton,modon):
        self.tname=tname
        self.tdesc=tdesc
        self.tstatus=tstatus
        self.tpriority=tpriority
        self.tnotes=tnotes
        self.tbm=tbm
        self.townid=townid
        self.tcrid=tcrid
        self.crton=crton
        self.modon=modon
    def ChangePriority(self, tpriority):
        change_Priority=input()
        self.tpriority=change_Priority

t1 = Task("A","abc..","Inprogress","Low","xyz","pqr",123,212,"02/12/2021","15/12/2021")
print(t1.tpriority)
t1.ChangePriority(t1.tpriority)
print(t1.tpriority)

