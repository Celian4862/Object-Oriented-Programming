package version2;

public class BasePlusCommissionEmployee extends ComissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {}

    public BasePlusCommissionEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public BasePlusCommissionEmployee(int empID, String empName, double totalSales, double baseSalary) {
        super(empID, empName, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        double salary = super.computeSalary();
        salary += baseSalary;
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(getEmpID()).append("\n");
        sb.append("Employee name: ").append(getEmpName()).append("\n");
        sb.append("Base salary: ").append(getBaseSalary()).append("\n");
        sb.append("Total sales: ").append(getTotalSales()).append("\n");
        sb.append("Salary: ").append(computeSalary()).append("\n");
        return sb.toString();
    }
}