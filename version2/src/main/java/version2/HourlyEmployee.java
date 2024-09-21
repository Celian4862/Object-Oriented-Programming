package version2;

public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {}

    public HourlyEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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