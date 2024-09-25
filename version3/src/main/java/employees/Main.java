package employees;

public class Main {
    public static void main(String[] args) {
        Employee person = new Employee(1, "John", "Doe", "Smith");
        System.out.println(person.getEmpName());
        person.setEmpDOB(1990, 1, 1);
        person.setEmpDOJ(2010, 1, 1);
        System.out.println(person.getEmpDOB().getDate());
        System.out.println(person.getEmpDOJ().getDate());
    }
}