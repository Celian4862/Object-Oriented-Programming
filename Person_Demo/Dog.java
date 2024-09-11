package Person_Demo;

public class Dog extends Animal {
    private Person owner;

    public Dog() {}

    public Dog(Person owner) {
        this.owner = owner;
    }

    public Dog (Person owner, String name) {
        super(name);
        this.owner = owner;
    }

    public Person getOwner() {
        return this.owner;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog is barking.");
    }

    @Override
    public String toString () {
        return String.format("Dog name: %s", super.getName());
    }
}