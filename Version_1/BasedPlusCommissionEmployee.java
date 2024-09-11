package Version_1;

public class BasedPlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasedPlusCommissionEmployee() {}

    public BasedPlusCommissionEmployee(double baseSalary) {
        super();
        this.baseSalary = baseSalary;
    }

    // public double getTotalSales() {
    //     return totalSales;
    // }

    // public void setTotalSales(double totalSales) {
    //     this.totalSales = totalSales;
    // }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // public String getEmpName() {
    //     return empName;
    // }

    // public void setEmpName(String empName) {
    //     this.empName = empName;
    // }

    // public int getEmpID() {
    //     return empID;
    // }

    // public void setEmpID(int empID) {
    //     this.empID = empID;
    // }

    @Override
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total sales: ").append(this.totalSales).append("\n");
        sb.append("Base salary: ").append(this.baseSalary).append("\n");
        sb.append("Employee name: ").append(this.empName).append("\n");
        sb.append("Employee ID: ").append(this.empID).append("\n");
        return sb.toString();
    }
}