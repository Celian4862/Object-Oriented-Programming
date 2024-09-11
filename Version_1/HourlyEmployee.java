package Version_1;

public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    public HourlyEmployee() {}

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
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
        System.out.println("Employee ID: " + empName);
        System.out.println("Employee name: " + empID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total hours worked: ").append(this.totalHoursWorked).append("\n");
        sb.append("Rate per hour: ").append(this.ratePerHour).append("\n");
        sb.append("Employee name: ").append(this.empName).append("\n");
        sb.append("Employee ID: ").append(this.empID).append("\n");
        return sb.toString();
    }
}