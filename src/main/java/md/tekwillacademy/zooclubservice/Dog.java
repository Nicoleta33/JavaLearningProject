package md.tekwillacademy.zooclubservice;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog is making: Brr! Hrr! Auff" );
    }

    @Override
    public void eat() {
        System.out.println(getName() + " Dog is eating bones");
    }
}
