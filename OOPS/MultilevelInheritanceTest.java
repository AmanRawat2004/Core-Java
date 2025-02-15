/*Multilevel Inheritance:
Create three classes:
Animal (with a move() method),
Bird (extends Animal and overrides move()),
Penguin (extends Bird and overrides move()).
Write a program to test method overriding in multilevel inheritance.
*/
class Animal {
    void move() {
        System.out.println("Animals move in different ways.");
    }
}

class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Birds fly in the sky.");
    }
}

class Penguin extends Bird {
    @Override
    void move() {
        System.out.println("Penguins cannot fly, but they swim.");
    }
}

public class MultilevelInheritanceTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();

        Bird b = new Bird();
        b.move();

        Penguin p = new Penguin();
        p.move();

        Animal ref1 = new Bird();
        ref1.move();

        Animal ref2 = new Penguin();
        ref2.move();
    }
}
