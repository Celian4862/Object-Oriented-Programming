package employees;

public class Main {
    public static void main(String[] args) {
        Name none = new Name(), ntwo = new Name("Urs", "Curs"), nthree = new Name("Nar", "Car", "Par"), nfour = new Name("Put"), nfive = new Name();

        none.setFname("Ger");
        none.setMname("Fer");
        none.setLname("Per");
        none.displayName();

        ntwo.setMname("Alors");
        ntwo.displayName();

        nthree.displayName();

        nfour.setFname("Dut");
        nfour.setMname("Cut");
        nfour.displayName();

        nfive.setName("Presque", "Close", "Near");
        nfive.displayName();

        Date done = new Date(), dtwo = new Date(2004), dthree = new Date(1997, 1), dfour = new Date(2000, 2, 14), dfive = new Date();

        done.setYear(1884);
        done.setMonth(12);
        done.setDay(24);
        done.display();

        dtwo.setMonth(4);
        dtwo.setDay(14);
        dtwo.display();

        dthree.setDay(31);
        dthree.display();

        dfour.display();

        dfive.setDate(2024, 10, 14);
        dfive.display();
        
        Employee pone = new Employee(), ptwo = new Employee(2), pthree = new Employee(3, "Jers", "Pers"), pfour = new Employee(4, "Pour", "Cour", "Dour"), pfive = new Employee(5, none, done, dthree);

        pone.setEmpID(1);
        pone.setEmpName("Hup", "Cup", "Dup");
        pone.setEmpDOB(2002, 5, 15);
        pone.setEmpDOJ(2024, 7, 1);
        pone.displayEmployee();

        ptwo.setEmpName("Bup", "Tup", "Rup");
        ptwo.setEmpDOB(2003, 2, 28);
        ptwo.setEmpDOJ(2022, 12, 1);
        ptwo.displayEmployee();

        pthree.setEmpDOB(2005, 9, 4);
        pthree.setEmpDOJ(2021, 9, 4);
        pthree.displayEmployee();

        pfour.setEmpDOB(2001, 8, 12);
        pfour.setEmpDOJ(2025, 7, 10);
        pfour.displayEmployee();

        pfive.displayEmployee();
    }
}