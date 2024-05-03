package md.tekwillacademy.zooclubservice;

public class Mouse extends Animal {

    public Mouse (String name){
        super(name);

    }
    @Override
    public void eat() {
        System.out.println(getName() + " the mouse is eating all the trash");

    }

    @Override
    public void makeSound() {

    }





}
