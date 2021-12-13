class LowBalance:
    def __init__(self,message):
        self.message=message
class Account:
    def __init__(self,accNo,branch,city,balance):
        self.accNo=accNo
        self.branch=branch
        self.city=city
        self.balance=balance
    def deposit(self):
        amount=int(input("Enter the deposit amount: "))
        self.balance += amount

    def Withdraw(self):
        amount=int(input("Enter the Withdraw amount: "))
        if(amount>self.balance):
            raise LowBalance("Insufficient Fund")
        try:
            self.balance -= amount

    def ShowDetails(self):
        print(self.accNo,self.branch,self.city,self.balance)


class LoanAccount(Account):

    def __init__(self, accNo, branch, city, balance):
        super().__init__(accNo,branch,city,balance)

    def deposit(self):
        amount = int(input("Enter the deposit amount: "))
        self.balance -= amount

    def Withdraw(self):
        amount = int(input("Enter the Withdraw amount: "))
        if(self.balance>600000):
            raise LowBalance("Reached withdrawal limit: ")
        try:
            self.balance += amount

s1=Account(123456,"xyz","Pune",0)
c1=Account(2345666,"xyz","Pune",0)
l1=LoanAccount(22222,"xyz","Pune",500000)
l1.Withdraw()
l1.ShowDetails()

