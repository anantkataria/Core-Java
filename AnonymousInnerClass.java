class A {
    public void show() {
        System.out.println("In A Show");
    }
}

abstract class B {
    public abstract void show();
    public abstract void config();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        // this is a way to define anonymous inner class
        {
            public void show() {
                System.out.println("In anon A show");
            }
        };
        obj.show();

        B obj1 = new B() 
        // this inner class is based on the abstract class B
        // this obj1 is not of type B (since B is abstract, it can't create objects), but it is of type inner class, which is not abstract as both abstract methods are implemented
        {
            public void show() {
                System.out.println("In anon B show");
            }

            public void config() {
                System.out.println("In anon B config");
            }
        };
        // this obj1 is the object of the newly implement inner class over the class B
        obj1.show();
        obj1.config();
    }
}
