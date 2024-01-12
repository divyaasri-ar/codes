//println "Hello all! Welcome to Day4"

/*class x
{
//def a=50
def a
def m1()
{
//a=100
this.a=100
//def a=100
println a
}
def m2()
{
def b=150
println b
println a
}
}

println x1
x1.m1()
x1.m2() 

class x
{
def x()
{
println "I am in constructor of x"
}
def m1()
{
println "I am in m1 of x"
}
}
x1=new x()
x1.m1() 

class x
{
def a
def b
def x(a,b)
{
this.a=a
this.b=b
println "I am in constructor of x"
}
def m1()
{
println "Sum is: ${a+b}"
println "I am in m1 of x"
}
}
x1=new x(5,4)
x1.m1() */

/* class Bank
{
def bankname="SBI"
def cust_name
def cust_acc_no
def balance
def address
def Bank(cust_name,cust_acc_no,balance,address)
{
this.cust_name=cust_name
this.cust_acc_no=cust_acc_no
this.balance=balance
this.address=address
println "Welcome SBI"
}
def withdraw()
{
def amt=System.console().readLine ("Enter amount to withdraw: ")
amt=amt as int
if(balance>amt)
{
balance=balance-amt
println "You have successfully withdrawed"
}
else
{
println "Insufficient amount"
}
}
def deposit()
{
def dep=System.console().readLine ("Enter your amount to deposit: ")
dep=dep as int
balance=balance+dep
println "You have successfully deposited Rs. $dep"
}
def balenq()
{
println "Your balance amount is Rs. $balance"
}
def customerdetails()
{
println "Customer Name: $cust_name"
println "Customer Account Number: $cust_acc_no"
println "Balance: $balance"
println "Address: $address"
}
}
b=new Bank("divyaasri",500101015649724,2500.00,"Chennai")
b.withdraw()
b.deposit()
b.balenq()
b.customerdetails() */

/*class Bank {
    def bankName = "SBI"
    def custName
    def custAccNo
    def balance
    def address

    Bank(custName, custAccNo, balance, address) {
        this.custName = custName
        this.custAccNo = custAccNo
        this.balance = balance
        this.address = address
        println "Welcome to $bankName"
    }

    def withdraw() {
        def amt = System.console().readLine("Enter amount to withdraw: ") as int
        if (balance >= amt) {
            balance -= amt
            println "You have successfully withdrawn Rs. $amt"
        } else {
            println "Insufficient funds"
        }
    }

    def deposit() {
        def dep = System.console().readLine("Enter amount to deposit: ") as int
        balance += dep
        println "You have successfully deposited Rs. $dep"
    }

    def balanceInquiry() {
        println "Your balance amount is Rs. $balance"
    }

    def customerDetails() {
        println "Customer Name: $custName"
        println "Customer Account Number: $custAccNo"
        println "Balance: $balance"
        println "Address: $address"
    }
}

def myBank = new Bank("John Doe", "1234567890", 1000, "123 Main St")
myBank.withdraw()
myBank.deposit()
myBank.balanceInquiry()
myBank.customerDetails()
 */

import JavaClass
import day3
def groovyInstance=new JavaClass()
groovyInstance.printMessage()




