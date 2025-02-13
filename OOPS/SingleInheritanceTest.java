/*Single Inheritance:
Create a Animal class with a method makeSound() that prints "Animal makes a sound." Create a subclass Dog that overrides makeSound() to print "Dog barks." Write a program to test these classes.*/
class animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritanceTest {
    public static void main(String[] args) {
        animal a = new animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();
    }
}

