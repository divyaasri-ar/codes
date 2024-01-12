// println "Hi! Good Morning"

/* atm_pin='1234'
a=1
while(true)
{
num1=System.console().readLine ("Enter your pin: ")
num1=num1 as int
if(num1==1234)
{
println "You have successfully logged in"
break
}
else if(a==3)
{
println "You tried 3 times. Limit crossed"
break
}
a++
} */



/*for (i=1;i<=10;i++)
{
println i
}
println "#"*20

for (i in 1..10)
{
println i
}

println "#"*20

my_list=[10,20,30,40]
for (j in my_list)
{
println j
}

println "#"*20

for (i in 1..10)
{
if(i==5 || i==7)
{
continue
}
println i
}

println "#"*20

for (i in 1..10)
{
if(i==5)
{
break
}
println i
}*/

//write a script to display 1 to 50.
//for the multiples of 3 display "Fizz" instead of number
// 5- "Buzz"
// 3 and 5 "Fizz Buzz"

/*for (i in 1..50)
{
if(i%3==0 && i%5==0)
{
println "Fizz Buzz"
}
else if(i%3==0)
{
println "Fizz"
}
else if(i%5==0)
{
println "Buzz"
}
else
{
println i
};
}*/

/*num1=System.console().readLine ("Enter your number: ")
num1=num1 as int
switch(num1)
{
case 1:
{
println "Given number is 1"
break
}
case 2:
{
println "Given number is 2"
break
}
case 3:
{
println "Given number is 3"
break
}
default:
{
println "Invalid number"
}
}*/


/*num1=System.console().readLine ("Enter your number: ")
num1=num1 as int
switch(num1)
{
case 1..5:
{
println "Given number is from 1 to 5"
break
}
case 6..10:
{
println "Given number is from 6 to 10"
break
}
case 11..15:
{
println "Given number is from 11 to 15"
break
}
default:
{
println "Invalid number"
}
}*/

/*num1=System.console().readLine ("Enter your number: ")
num1=num1 as int
switch(num1)
{
case 1..9:
{
println "Given number is single digit number"
break
}
case 10..99:
{
println "Given number is double digit number"
break
}
case 100..999:
{
println "Given number is three digit number"
break
}
default:
{
println "Invalid number"
}
}*/

/*ch=System.console().readLine ("Enter your choice: ")
switch(ch)
{
case ~ /[a-zA-Z]/:
println "Its alphabet"
break 

case ~ /[1-9]/:
println "Its digit"
break

case ~ /[^0-9A-Za-z]/:
println "Its special Character"
break

default:
println "Not Matched"
}*/


/*l=[10,20,30,"Groovy",4.5]
println l
for (i in l)
{
println i
}
len=l.size()
println "Total length is $len";
println l[0]
println l[-1]
println l[0,2]
println l[0..2]
l[3]="Linux"
println l
l[0..2]=[100,200,300]
println l*/


/*my_list=[10,20,30,"Groovy",4.5,[100,200,300]]
println my_list[-1][-1]
my_list[-1][-1]=400
println my_list
len=my_list.size()
println len*
println my_list.getClass()

k="Linux"
println k
println k.replace('L','Z')
println k
s=k.replace('L','J')
println s*/


/*l=[10,10,20,40,"Groovy",3.4,34,65]
println l.size()
println l.count(10)
println l.remove(1)
println l
println l.pop()
println l
println l.sort()
println l
println l.add(33)
println l
println l.contains(20)
println l.push(11)
println l
println l.drop(2)
println "Final $l"*/

/*emp_details=[101:"John",102:"Bob",103:"Siri"]
println emp_details
println emp_details[101]
println emp_details[102]
emp_details[101]="Ravi"
println emp_details
emp_details1=[101:["John","DevOps","TCS","US"],102:"Bob",103:"Siri"]
println emp_details1
println emp_details1[101]
println emp_details1[101][1]
emp_details1[101][1]="DS"
println emp_details1


//create hash map with car info brand anem,color,model no,price 
car_info=["brandname":"BMW","color":"Black","model":"BMW i","price":"10000000"]
println car_info
println car_info["brandname"]
println car_info["price"]
for (i in car_info)
{
println i
}

v=car_info.values()
println v
s=car_info.size()
println s
println car_info.containsKey("brandname")
println car_info.containsKey("name")

k=car_info.keySet()
println k
for (a in k)
{
println a + "=>" + car_info[a]
}
*/
//carinfo=["BMW":["Black","BMWi","10000000"],"Audi":["Blue","Audixi","500000"]] 

/*fo=new File('text.txt')
if(fo.exists())
{
println "File exists"
}
else
{
println "File does not exist"
}
println "###############"
k=fo.getText()
println k
println "################"
println k.getClass()

println"_____________________"

fo=new File("D:/java programs/text2.txt")
println "###############"
k=fo.getText()
println k
println "################"
println k.getClass()

fo=new File('text.txt')
println "###############"
a=fo.readLines()
for (i in fo.readLines())
{
println i
}
println a
println "################"
println a.getClass()
println "***************"
for (i in a[2..4])
{
println i
}
println a
println "*******###########"
println a.contains("Groovy")
for (i in fo.readLines())
{
if(i=="Groovy")
{
println i
}
}
println "_______________________"
for (i in fo.readLines())
{
if(i =~ /Groovy/)
{
println i
}
else
{
println "Groovy not found"
}
*/

/*
fo=new File('text.txt')
println "###############"
a=fo.readLines()
for (i in fo.readLines())
{
if(i =~ /^Groovy/)
//if( i =~ /Groovy$/)
{
println i
}
}
*/

fo=new File('text.txt')
println "###############"
a=fo.readLines()
for (i in fo.readLines())
{
//if(i =~ /^Groovy/ && i=~ /Groovy$/)
if(i =~ /^Groovy$/)
{
println i
}
}
