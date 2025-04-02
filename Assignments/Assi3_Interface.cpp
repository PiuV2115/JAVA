// First Interface
interface A {
    void methodA();
}

// Second Interface
interface B {
    void methodB();
}

// Interface C extending multiple interfaces (Multiple Inheritance)
interface C extends A, B {
    void methodC();
}

// Abstract class implementing interface C
abstract class AbstractClass implements C {
    final int finalVar = 100; // Final variable (constant)

    // Abstract method (must be implemented in subclass)
    abstract void abstractMethod();

    // Final method (cannot be overridden)
    final void finalMethod() {
        System.out.println("This is a final method from AbstractClass.");
    }

    // Concrete method (can be inherited)
    void normalMethod() {
        System.out.println("This is a normal method from AbstractClass.");
    }
}

// Final class (Cannot be inherited further)
final class FinalClass extends AbstractClass {
    // Implementing abstract method
    void abstractMethod() {
        System.out.println("Abstract method implemented in FinalClass.");
    }

    // Implementing methods from interfaces
    public void methodA() {
        System.out.println("Method A implemented from Interface A.");
    }

    public void methodB() {
        System.out.println("Method B implemented from Interface B.");
    }

    public void methodC() {
        System.out.println("Method C implemented from Interface C.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();

        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.abstractMethod();
        obj.normalMethod();
        obj.finalMethod();

        System.out.println("Final Variable: " + obj.finalVar);
        
        // obj.finalVar = 200; // Error: Cannot assign value to final variable
    }
}
