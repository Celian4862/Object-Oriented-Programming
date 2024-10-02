package version2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(), emp2 = new Employee(223, "John Doe"), emp3 = new Employee("Jane Doe", 456), emp4 = new Employee(789), emp5 = new Employee("Jane Smith");
        emp1.setEmpID(123);
        emp1.setEmpName("John Doe");
        emp4.setEmpName("Jane Doe");
        emp5.setEmpID(456);

        emp1.displayEmployee();
        System.out.println(emp1);
        emp2.displayEmployee();
        System.out.println(emp2);
        emp3.displayEmployee();
        System.out.println(emp3);
        emp4.displayEmployee();
        System.out.println(emp4);
        emp5.displayEmployee();
        System.out.println(emp5);

        HourlyEmployee he1 = new HourlyEmployee(1, "John Doe", 100, 10.0), he2 = new HourlyEmployee("Jane Doe", 20), he3 = new HourlyEmployee(200, 5.0), he4 = new HourlyEmployee(4, "Jane Smith"), he5 = new HourlyEmployee();
        he2.setRatePerHour(10.0);
        he2.setEmpID(2);
        he3.setEmpName("Jane Smith");
        he3.setEmpID(3);
        he4.setTotalHoursWorked(50);
        he4.setRatePerHour(20.0);
        he5.setEmpID(5);
        he5.setEmpName("John Smith");
        he5.setTotalHoursWorked(100);
        he5.setRatePerHour(15.0);

        he1.displayHourlyEmployee();
        System.out.println(he1);
        he2.displayHourlyEmployee();
        System.out.println(he2);
        he3.displayHourlyEmployee();
        System.out.println(he3);
        he4.displayHourlyEmployee();
        System.out.println(he4);
        he5.displayHourlyEmployee();
        System.out.println(he5);

        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(1, "John Doe", 100, 10.0), pwe2 = new PieceWorkerEmployee("Jane Doe", 5), pwe3 = new PieceWorkerEmployee(5.0, 200), pwe4 = new PieceWorkerEmployee(4, "Jane Smith"), pwe5 = new PieceWorkerEmployee();
        pwe2.setFinishedPieces(1000);
        pwe2.setRate(0.5);
        pwe3.setEmpID(3);
        pwe3.setEmpName("Jane Smith");
        pwe4.setFinishedPieces(500);
        pwe4.setRate(1.0);
        pwe5.setEmpID(5);
        pwe5.setEmpName("John Smith");
        pwe5.setFinishedPieces(2000);
        pwe5.setRate(0.75);

        pwe1.displayHourlyEmployee();
        System.out.println(pwe1);
        pwe2.displayHourlyEmployee();
        System.out.println(pwe2);
        pwe3.displayHourlyEmployee();
        System.out.println(pwe3);
        pwe4.displayHourlyEmployee();
        System.out.println(pwe4);
        pwe5.displayHourlyEmployee();
        System.out.println(pwe5);

        CommissionEmployee ce1 = new CommissionEmployee(2, "Jane Doe", 10000), ce2 = new CommissionEmployee("Jane Smith"), ce3 = new CommissionEmployee(3), ce4 = new CommissionEmployee(4, "John Smith"), ce5 = new CommissionEmployee();
        ce2.setEmpID(2);
        ce2.setTotalSales(100000);
        ce3.setEmpName("Jane Smith");
        ce3.setTotalSales(1000000);
        ce4.setTotalSales(10000000);
        ce5.setEmpID(5);
        ce5.setEmpName("John Smith");
        ce5.setTotalSales(100000000);

        ce1.displayHourlyEmployee();
        System.out.println(ce1);
        ce2.displayHourlyEmployee();
        System.out.println(ce2);
        ce3.displayHourlyEmployee();
        System.out.println(ce3);
        ce4.displayHourlyEmployee();
        System.out.println(ce4);
        ce5.displayHourlyEmployee();
        System.out.println(ce5);

        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(3, "John Smith", 100000, 1000), bpce2 = new BasePlusCommissionEmployee(3, "Jane Doe"), bpce3 = new BasePlusCommissionEmployee("Jane Smith", 4, 10000, 1000), bpce4 = new BasePlusCommissionEmployee(1000000, 1000), bpce5 = new BasePlusCommissionEmployee();
        bpce2.setTotalSales(1000);
        bpce2.setBaseSalary(1000);
        bpce4.setEmpID(4);
        bpce4.setEmpName("Jane Smith");
        bpce5.setEmpID(5);
        bpce5.setEmpName("John Smith");
        bpce5.setTotalSales(100000);
        bpce5.setBaseSalary(1000);

        bpce1.displayHourlyEmployee();
        System.out.println(bpce1);
        bpce2.displayHourlyEmployee();
        System.out.println(bpce2);
        bpce3.displayHourlyEmployee();
        System.out.println(bpce3);
        bpce4.displayHourlyEmployee();
        System.out.println(bpce4);
        bpce5.displayHourlyEmployee();
        System.out.println(bpce5);
    }
}