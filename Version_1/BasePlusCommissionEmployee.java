package Version_1;

public class BasePlusCommissionEmployee {
    private double baseSalary;
    private double totalSales;
    private String empName;
    private int empID;

    public BasePlusCommissionEmployee() {}

    public BasePlusCommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public BasePlusCommissionEmployee(int empID, String empName, double totalSales, double baseSalary) {
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
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
        salary += baseSalary;
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(getEmpID()).append("\n")
            .append("Employee name: ").append(getEmpName()).append("\n")
            .append("Base salary: ").append(getBaseSalary()).append("\n")
            .append("Total sales: ").append(getTotalSales()).append("\n")
            .append("Salary: ").append(computeSalary()).append("\n");
        return sb.toString();
    }
}