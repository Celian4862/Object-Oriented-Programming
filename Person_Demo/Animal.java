package Person_Demo;

public class Animal {
    private String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void makeSound() {
        System.out.println("The animal is making a sound.");
    }

    @Override
    public String toString() {
        return String.format("Animal name: %s", name);
    }
}