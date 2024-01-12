//println "Good Morning"
/*
fo=new File('test.txt')
for (i in fo.readLines())
{
//if(i =~ /ab*c/)
//if(i =~ /ab+c/)
//if(i =~ /colou?r/)
//if(i =~ /\w+\s\w+\s\w+/) or .+\s.+\s.+\s or /^\w+\s\w+\s\w+$/
//if (i =~ /a.c/)
//if (i =~ /^\w+\s\w+\s\w+$/)
//if (i =~ /.+\s.+\s.+/)
if (i =~ /^.+\s.+\s.+$/)
{
println i
}
} */

/*fo=new File('test.txt')
for (i in fo.readLines())
{
if(i =~ /[a-zA-Z]{2,}/)
{
println i
}
if(i =~ /^[6-9][0-9]{9}$/)
{
println i
}
if(i =~ /[a-z][a-z0-9.]+[@][a-z]+[.][a-z]{2,4}/)
{
println i
}
}


fo=new File('test.txt')
for (i in fo.readLines())
{
//if(i =~ /\bdivya\b/)
//if(i =~ /^divya$/)
if(i =~ ^groovy.*groovy$)
{
println i
}
}*/

/*def f1()
{
println "Welcome to funtion concept"
}
f1()
f1()

def f2(a,b)
{
println "Sum of a and b is : ${a+b}"
println "Sub of a and b is : ${a-b}"
println "Mul of a and b is : ${a*b}"
println "Div of a and b is : ${a/b}"
println "Mod of a and b is : ${a%b}"
println "*"*50
}
f2(20,10)
f2(25,13)
f2(15,30)

x=100
def f1()
{
println "I am in f1"
println "x is : $x"
def k=20
println k
y=10
println y
}
def f2()
{
println "I am in f2"
println "X is : $x"
println y
println k
}
f1()
f2()

def f1(a,b)
{
sum=a+b
return sum
}
println f1(10,20) 


def find_avg_marks(name,marks)
{
println "Hi $name"
sumofmarks=marks.sum()
totalsub=marks.size()
avgmarks=sumofmarks/totalsub
return avgmarks
}
def compute_grade(avgmarks)
{
if(avgmarks>=80)
{
grade='A'
}
else if(avgmarks>=60)
{
grade='B'
}
else if(avgmarks>=50)
{
grade='C'
}
else
{
grade='F'
}
return grade
}
marks=[45,67,69,90,68,55]
avgmarks=find_avg_marks('Bob',marks)
println "Your average marks is $avgmarks"
grade=compute_grade(avgmarks)
println "Your grade is $grade"  
def f1(name,age=10)
{
println name
println age
}
f1("Bob",23)
f1("Siri")


import arithmetic as arith
x=System.console().readLine "Enter num1: "
x= x as int
y=System.console().readLine "Enter num2: "
y=y as int
result= new arithmetic().sum(x,y)
println result
sub=new arithmetic().sub(x,y)
println sub
r2=new arith().mul(x,y)
println r2
r3=new arith().div(x,y)
println r3  

import groovy.json.JsonSlurper
def jsonText='{"name":"John", "age":30,"car":null}'
def jsonSlurper= new JsonSlurper()
def jsonObject=jsonSlurper.parseText(jsonText)
println jsonObject
println jsonObject["name"]
println "Name: ${jsonObject.name}, Age: ${jsonObject.age}" 

import groovy.json.JsonSlurper
def filePath= 'user_data.json'
def jsonSlurper=new JsonSlurper()
def jsonData=jsonSlurper.parse(new File(filePath))
println jsonData
println jsonData.getClass()
println "Name: ${jsonData.name}" 

fo=new File('write.txt')
//fo.write("Hi groovy\nBye Groovy\n")
fo.append("Hi Divyaa Sri\n Welcome to groovy!!") 

import groovy.json.JsonOutput
def jsonData=[name:"John",age:30,city:"Chennai"]
def filePath='jsonfile.json'
def jsonContent=JsonOutput.toJson(jsonData)
new File(filePath).text=jsonContent
println "Data Successfully written to: $filePath" 

str1="groovy"
println str1
println str1.getClass()
println System.identityHashCode(str1)
str1=str1.replace('g','k')
println str1
println str1.getClass()
println System.identityHashCode(str1)

mylist=[10,20,30]
println mylist
println mylist.getClass()
println System.identityHashCode(mylist)
mylist[0]=100
println mylist
println mylist.getClass()
println System.identityHashCode(mylist) 


host_info=args
len=host_info.size()
if(len==3)
{
host_name=args[0]
username=args[1]
password=args[2]
println host_info
println host_name
println username
println password
}
else 
{
println "Invalid argument, expected only exact 3 argument"
} 

num1=10
num2=0
try
{
def result=num1/num2
println "Result $result"
}
catch(ArithmeticException e)
{
println "Division by zero error denominator should not be zero: ${e.message}"
}
catch(Exception e)
{
println "An unexcepted error occured: ${e.message}"
}


try
{
fo= new File('text21.txt')
println fo.getText()
}
catch(Exception e)
{
println "Unexcepted error: ${e.message}"
}  

import groovy.json.JsonOutput
def jsonData=[name:"John",age:30,city:"Chennai"]
def filePath='hjdfji/jsonfile.json'
try
{
def jsonContent=JsonOutput.toJson(jsonData)
new File(filePath).text=jsonContent
println "Data Successfully written to: $filePath" 
}
catch(Exception e)
{
println "error writing to json file: ${e.message}"
} 

//  oops
class Shape
{
def square()
{
println "This is Square"
}
}

def s=new Shape()
s.square() */

println "Hi form groovy"















