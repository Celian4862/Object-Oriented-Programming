package employees;

public class Main {
    public static void main(String[] args) {
        Employee person = new Employee(1, "John", "Smith");
        person.setEmpDOB(1990, 1, 1);
        person.setEmpDOJ(2010, 1, 1);
        person.displayEmployee();
    }
}