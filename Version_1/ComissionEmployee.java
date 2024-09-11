package Version_1;

public class ComissionEmployee {
    private double totalSales;
    private String empName;
    private int empID;

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
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
        double salary;
        if (totalSales < 10000) {
            salary = totalSales * 0.05;
        } else if (totalSales < 100000 && totalSales >= 10000) {
            salary = totalSales * 0.1;
        } else if (totalSales < 1000000) {
            salary = totalSales * 0.2;
        } else {
            salary = totalSales * 0.3;
        }
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee name: " + empName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total sales: ").append(this.totalSales).append("\n");
        sb.append("Employee name: ").append(this.empName).append("\n");
        sb.append("Employee ID: ").append(this.empID).append("\n");
        return sb.toString();
    }
}