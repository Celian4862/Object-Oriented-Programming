package Version_1;

public class Version_1 {
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee();
        emp1.setEmpID(1);
        emp1.setEmpName("John Deer");
        emp1.setTotalHoursWorked(15);
        emp1.setRatePerHour(13);

        HourlyEmployee emp2 = new HourlyEmployee(2, "Jane Doe");
        emp2.setTotalHoursWorked(40);
        emp2.setRatePerHour(90);

        HourlyEmployee emp3 = new HourlyEmployee(3, "Mark Twain", 50, 10);

        emp1.displayHourlyEmployee();

        emp2.displayHourlyEmployee();

        emp3.displayHourlyEmployee();


        PieceWorkerEmployee emp4 = new PieceWorkerEmployee();
        emp4.setID(4);
        emp4.setName("Happy Clam");
        emp4.setFinishedPieces(20);
        emp4.setRate(55);

        PieceWorkerEmployee emp5 = new PieceWorkerEmployee(5, "Yvonne Black");
        emp5.setFinishedPieces(30);
        emp5.setRate(10);

        PieceWorkerEmployee emp6 = new PieceWorkerEmployee(6, "Urgot Price");

        emp4.displayHourlyEmployee();

        emp5.displayHourlyEmployee();

        emp6.displayHourlyEmployee();


        ComissionEmployee emp7 = new ComissionEmployee();
        emp7.setEmpID(7);
        emp7.setEmpName("Tracy Kristin");
        emp7.setTotalSales(100);

        ComissionEmployee emp8 = new ComissionEmployee(8, "Ronda Alla");
        emp8.setTotalSales(20000);

        ComissionEmployee emp9 = new ComissionEmployee(9, "Nairobi Mansion", 200000);

        emp7.displayHourlyEmployee();

        emp8.displayHourlyEmployee();

        emp9.displayHourlyEmployee();

        emp7.setTotalSales(2000000);
        emp7.displayHourlyEmployee();


        BasePlusCommissionEmployee emp10 = new BasePlusCommissionEmployee();
        emp10.setEmpID(10);
        emp10.setEmpName("Wyverne Hollow");
        emp10.setTotalSales(100);
        emp10.setBaseSalary(1000);

        BasePlusCommissionEmployee emp11 = new BasePlusCommissionEmployee(11, "Tristine Hollow");
        emp11.setTotalSales(10000);
        emp11.setBaseSalary(3000);

        BasePlusCommissionEmployee emp12 = new BasePlusCommissionEmployee(12, "Nocturne Hollow", 100000, 5000);

        emp10.displayHourlyEmployee();

        emp11.displayHourlyEmployee();

        emp12.displayHourlyEmployee();
    }
}