/*var arr=[1,2,3,4,5]
for(let i=0;i<5;i++)
{
    console.log(arr[i])
}*/
//alert("Hi hello welcome");
/*function checkticket(){
let t=prompt("Enter no of tickets")
if(t>1&&t<10)
{
    alert(t*150);
}
else if(t>10){
    let res=confirm("You can book only 10 tickets")
    if(res==true)
    {
        checkticket()
    }
}
else if (t==0){
    let res=confirm('Do you want to cancel')
    if(res!=true)
    {
        checkticket()
    }
}
}
checkticket()*/
//swal("Hell00000000");
/*function display()
{
    let uname=document.getElementById("uname").value
    let pwd=document.getElementById("pwd").value
    if(uname=="Admin"&&pwd=="Reset@123")
    {
        swal("Welcome "+uname,"","success")
    }
    else{
        swal("Invalid "+uname,"","error")
    }

}*/
/*function display()
{
    let n1=parseInt(document.getElementById("n1").value)
    let n2=parseInt(document.getElementById("n2").value)
    let opr=document.querySelector('input[name="opr"]:checked').value
    if(opr=="add")
    {
        swal(n1+n2);
    }
    else{
        swal("Invalid opr ","","error")
    }

}*/

function display() {

    let n1 = parseFloat(document.getElementById("n1").value);

    let n2 = parseFloat(document.getElementById("n2").value);

    let opr = document.querySelector('input[name="opr"]:checked').value;
    if (opr == "add") {

        swal("Result","","success");

    } else {

        swal("Invalid opr", "", "error");

    }

}
