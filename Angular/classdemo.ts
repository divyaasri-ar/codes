class Employee
{
    // eid:number;
    // ename:string;
    // salary:number;
    private dept:string;
    constructor(public eid:number,public ename:string,public salary:number)
    {}
    public get Eid(){
        return this.eid
    }
    public get Ename(){
        return this.ename
    }
    public get Salary(){
        return this.salary
    }
    public get Dept(){
        return this.dept
    }
    public set Dept(dept:string)
    {
        this.dept=dept
    }
    public set Eid(eid:number)
    {
        this.eid=eid
    }
    public set Ename(ename:string)
    {
        this.ename=ename
    }
    public set Salary(salary:number)
    {
        this.salary=salary
    }
    public employeeDetails(){
        console.log(this);
    }
    
}
let emp=new Employee(102,'divya',90000);
emp.Dept='IT'
//console.log(emp);
emp.employeeDetails()
// emp.eid=101;
// emp.ename='jana';
// emp.salary=120000;
emp.Eid=103;
emp.Ename='Jana';
emp.Salary=12000;
emp.Dept='Manager'
emp.employeeDetails()
//console.log(emp)
var a;
let i=(9)=>{(a*a)};
console.log(i)