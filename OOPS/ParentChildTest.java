/*Access Parent Class Members:
Create a Parent class with a method greet() that prints "Hello from Parent."
Create a Child class that inherits Parent and call the greet() method from the Child class object.*/
class Parent {
    void greet() {
        System.out.println("Hello from Parent.");
    }
}

class Child extends Parent {
}

public class ParentChildTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
