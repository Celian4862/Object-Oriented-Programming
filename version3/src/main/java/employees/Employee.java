package employees;

public class Employee {
    private int empID;
    private Name empName;
    private Date empDOB; // Birthday
    private Date empDOJ; // Date joined

    public Employee() {
        this.empName = new Name();
        this.empDOB = new Date();
        this.empDOJ = new Date();
    }

    public Employee(int empID) {
        this.empID = empID;
        this.empName = new Name();
        this.empDOB = new Date();
        this.empDOJ = new Date();
    }

    public Employee(int empID, String fname, String mname, String lname) {
        this.empID = empID;
        this.empName = new Name(lname, fname, mname);
        this.empDOB = new Date();
        this.empDOJ = new Date();
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpName(String fname, String mname, String lname) {
        empName.setName(fname, mname, lname);
    }

    public String getEmpName() {
        return empName.getName();
    }

    public void setEmpDOB(int year, int month, int day) {
        empDOB.setDate(year, month, day);
    }

    public Date getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOJ(int year, int month, int day) {
        empDOJ.setDate(year, month, day);
    }

    public Date getEmpDOJ() {
        return empDOJ;
    }
}
