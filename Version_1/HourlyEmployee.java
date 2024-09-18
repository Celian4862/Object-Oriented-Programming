package Version_1;

public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    public HourlyEmployee() {}

    public HourlyEmployee(int empID, String EmpName) {
        this.empID = empID;
        this.empName = EmpName;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public double computeSalary() {
        double salary = 0;
        if (totalHoursWorked <= 40) {
            salary += totalHoursWorked * ratePerHour;
        } else {
            salary += 40 * ratePerHour;
            totalHoursWorked -= 40;
            salary += totalHoursWorked * 1.5;
        }
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(getEmpID()).append("\n");
        sb.append("Employee name: ").append(getEmpName()).append("\n");
        sb.append("Total hours worked: ").append(getTotalHoursWorked()).append("\n");
        sb.append("Rate per hour: ").append(getRatePerHour()).append("\n");
        sb.append("Salary: ").append(computeSalary()).append("\n");
        return sb.toString();
    }
}