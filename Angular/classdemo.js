var Employee = /** @class */ (function () {
    function Employee(eid, ename, salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }
    Object.defineProperty(Employee.prototype, "Eid", {
        get: function () {
            return this.eid;
        },
        set: function (eid) {
            this.eid = eid;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "Ename", {
        get: function () {
            return this.ename;
        },
        set: function (ename) {
            this.ename = ename;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "Salary", {
        get: function () {
            return this.salary;
        },
        set: function (salary) {
            this.salary = salary;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "Dept", {
        get: function () {
            return this.dept;
        },
        set: function (dept) {
            this.dept = dept;
        },
        enumerable: false,
        configurable: true
    });
    Employee.prototype.employeeDetails = function () {
        console.log(this);
    };
    return Employee;
}());
var emp = new Employee(102, 'divya', 90000);
emp.Dept = 'IT';
//console.log(emp);
emp.employeeDetails();
// emp.eid=101;
// emp.ename='jana';
// emp.salary=120000;
emp.Eid = 103;
emp.Ename = 'Jana';
emp.Salary = 12000;
emp.Dept = 'Manager';
emp.employeeDetails();
//console.log(emp)
