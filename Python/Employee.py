class Employee:
    def __init__(self,empid,name,address,dept,basic,hra):
        self.id = empid
        self.name = name
        self.address = address
        self.dept = dept
        self.basic = basic
        self.hra = hra

    def calSal(self):
        return self.basic + self.hra
class TechEmployee(Employee):
    def __init__(self,skill,empid,name,address,dept,basic,hra):
        super().__init__(empid,name,address,dept,basic,hra)
        self.skill=skill
        def calSal(self):
            return self.basic+self.hra+1000
emp1 = Employee(5000, "Ganesh", "Bangalore", "Delivery", 10000, 100)
tech= TechEmployee("python",5000, "Ganesh", "Bangalore", "Delivery", 10000, 100)
s = emp1.calSal()
print(tech.calSal())
print(tech.skill)
print(s)