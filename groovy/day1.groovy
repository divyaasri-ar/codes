/*/* println "Hello World!"
print "Hi groovy"
print "Bye groovy"
a=10
b=2.5
c="Groovy"
d='python'
istodayfriday=true
println "The variable a value is $a"
println "The sum of a and b is ${a+b}"
println a.getClass()
println b
println c
println d
println istodayfriday */

//str1='I don't know groovy'
//str2="Hi "welcome to groovy""
//str3='Hi "welcome to groovy"'
//str4="I don't know groovy"
//str5='I don\'t know groovy'
//str6="Hi !\" welcome to groovy\""
//println str1
//println str2
//println str3
//println str4
//println str5
//println str6

/* str1='Groovy Scoript'
println str1[0]
println str1[-1]
println str1[4]
println str1[12]
println str1[-2]
println str1[0..5]
len=str1.length()
println "Total length of the string is: $len"
println str1.substring(4)
println str1.substring(4,8)
println "IndexOf----------------"
println str1.indexOf('o')
println str1.indexOf('o',5)
println str1.replace("Scoript","Script")
println str1.toLowerCase()
println str1.toUpperCase()
println str1.reverse()
println str1.split(" ")
println str1.split('v')
str2=["apple","mango","grape"]
println str2.join("and")
user_info="siri:x:100001:100001:Hyd:/home/siri:/bin/shell"
println user_info.split(':')[0]
file_info="22Dec2023 192.161.1.10 80 192.161.1.11 88 web.cgi"
s1=file_info.split(" ")[1..4]
s2=s1.join(" ")
println s2 */

/* name=System.console().readLine "Enter your name"
println "Hi $name . Welcome to groovy" */

/* n1=System.console().readLine "Enter your num1: "
n1=n1 as int
println n1.getClass()
n2=System.console().readLine "Enter your num2: "
n2=n2 as int
println "Sum is: ${n1+n2}" */

/* x=10
y=3
z=4
s1=x+y*z
println s1
s2=(x+y)*z
println s2
println "Sum is ${x+y}"
println "sub is ${x-y}"
println "mul is ${x+y}"
println "div is ${x/y}"
println "rem is ${x%y}"
println "power is ${x**y}"
println x>y
println x<y
println x==y
println x!=y */
/* a="abcd"
b="bc"
c="abce"
println a>b
println a<b
println a==b
println a!=b
println a.length()>b.length() */

/* println "#"*20

num1=System.console().readLine"Enter num1: "
num1=num1 as int
if(num1>0)
{
println "$num1 is positive"
}
println "Bye!!" */

/* println "#"*20

num1=System.console().readLine"Enter num1: "
num1=num1 as int
if(num1>0)
{
println "$num1 is positive"
}
else
{
println "$num1 is not a positive"
}
println "Bye!!" */

/* println "#"*20

num1=System.console().readLine"Enter num1: "
num1=num1 as int
if(num1%2==0)
{
println "$num1 is even"
}
else
{
println "$num1 is odd"
}
println "Bye!!"

println "#"*20

num1=System.console().readLine"Enter num1: "
num1=num1 as int
if(num1>99 && num1<1000)
{
println "$num1 is three digit number"
}
else
{
println "$num1 is not a three digit number"
}
println "Bye!!" */

/* println "#"*20

num1=System.console().readLine"Enter num1: "
num1=num1 as int
if(num1>0)
{
println "$num1 is positive"
}
else if(num1<0)
{
println "$num1 is negative"
}
else
{
println "$num1 is zero"
}
println "Bye!!" */

/I* println "\n\n\n\n\t\t\t\tFood Menu\n\t\t\t\t**** ****\n1. Veg Menu\n2.Non Veg Menu\n3.Jain Menu"
option=System.console().readLine "Enter your Choice: "
option=option as int
if(option==1)
{
println "1.Idly\n2.Dosa\n3.Veg Briyani"
}
else if(option==2)
{
println "1.Chicken Briyani\n2.Mutton Briyani"
}
else if(option==3)
{
println "1.Jain Dal\n2.Jain Soup\n3.Jain Rice"
} */

/* num1=System.console().readLine "Enter num1: "
num1=num1 as int
num2=System.console().readLine "Enter num2: "
num2=num2 as int
 println "The Script perform arithmetic operators\n1. Sum\n2. Sub\n3. Mul\n4. Div\n5. Mod\n6.Exponent"
option=System.console().readLine "Select your Choice: "
option=option as int
if(option==1)
{
println "Sum of num1 and num2 is: ${num1+num2}"
}
else if(option==2)
{
println "Sub of num1 and num2 is: ${num1-num2}"
}
else if(option==3)
{
println "Mul of num1 and num2 is: ${num1*num2}"
}
else if(option==4)
{
println "Div of num1 and num2 is: ${num1/num2}"
}
else if(option==5)
{
println "Mod of num1 and num2 is: ${num1%num2}"
}
else if(option==6)
{
println "Exponent of num1 and num2 is: ${num1**num2}"
}
else
{
println "Invalid option"
} */


/* num1=System.console().readLine"Enter num1: "
num1=num1 as int
if(num1>0)
{
println "$num1 is positive"
if(num1<10)
{
println "$num1 is single digit"
if(num1%2==0)
{
println "$num1 is single digit even number"
}
else
{
println "$num1 is single digit odd number"
}
}
else
{
println "$num1 is not a single digit"
}
}
else if(num1<0)
{
println "$num1 is negative"
}
else
{
println "$num1 is zero"
}*/

//print 1 to 10
num1=1
while(num1<=10)
{
println "$num1"
num1++
}

//println 10 to 1

/* num1=10
while(num1>0)
{
println "$num1"
num1--
}*/

/* num1=0
while(num1<10)
{
num1++
if(num1==5)
{
continue
}
println "$num1"
}

num1=1
while(num1<=10)
{
if(num1==5)
{
num1++
continue
}
println "$num1"
num1++
} */
*/

/*while(true)
{
num1=System.console().readLine ("Enter num1: ")
num1=num1 as int
if(num1>0)
{
//println "Square of value $num1 is ${num1 * num1}"
println "Square of value $num1 is ${num1 * num1}"
break
}
else if(num1<0)
{
continue
}
else if(num1==0)
{
break
}
}*/

def list = [1, 2, 3, 4, 5]
def result = list.any { it > 3 }
println result





