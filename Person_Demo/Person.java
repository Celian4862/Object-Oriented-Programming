package Person_Demo;

public class Person {
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating food.");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void eat(Person person) {
        System.out.println(name + " is eating " + person.getName());
    }

    @Override
    public String toString() {
        return String.format("PERSON NAME: %s", name);
    }
}