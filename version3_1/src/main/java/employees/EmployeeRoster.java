package employees;

public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int max;

    public EmployeeRoster(int max) {
        empList = new Employee[max];
        count = 0;
        this.max = max;
    }

    public boolean addEmployee(Employee e) {
        if (count < max) {
            empList[count++] = e;
            return true;
        }
        return false;
    }

    public Employee removeEmployee(int id) {
        Employee e;
        for (int i = 0; i < count; i++) {
            if (id != empList[i].getEmpID()) {
                e = empList[i];
                for (int j = i; j + 1 < count; j++) {
                    empList[j] = empList[j + 1];
                    count--;
                }
                return e;
            }
        }
        return new Employee();
    }

    public int countHE() {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countCE() {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (empList[i] instanceof CommissionEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countBPCE() {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countPWE() {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                count++;
            }
        }
        return count;
    }

    public void displayHE() {
        System.out.printf("%10s %20s %14s %14s %14s %32", "ID", "Name", "Date Joined", "Birth Date", "Salary", "Type of Employee");
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                System.out.printf("");
            }
        }
    }
}
