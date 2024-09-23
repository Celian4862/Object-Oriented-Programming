package version2;

public class BasePlusCommissionEmployee extends ComissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {}

    public BasePlusCommissionEmployee(double totalSales, double baseSalary) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public BasePlusCommissionEmployee(String empName, int empID, double baseSalary, double totalSales) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
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
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
            .append("Employee ID: ").append(getEmpID()).append("\n")
            .append("Employee name: ").append(getEmpName()).append("\n")
            .append("Base salary: ").append(getBaseSalary()).append("\n")
            .append("Total sales: ").append(getTotalSales()).append("\n");
        return sb.toString();
    }
}