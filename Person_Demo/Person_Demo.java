package Person_Demo;

public class Person_Demo {
    public static void main(String[] args) {
        Person p1 = new Person("Kurt");

        Dog d1 = new Dog(p1, "Noodle");
        
        System.out.println(d1);
        d1.makeSound();
    }
}