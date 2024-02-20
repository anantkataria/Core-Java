class A {
    public void show() {
        System.out.println("In A show");
    }
}

// B is a A
class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

// C is a A
class C extends A {
    public void show() {
        System.out.println("In C show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // here the obj is still of type A, and we are assigning it the reference of B
        // and when we call show() on this object of class A, it will invoke the show() method from class B
        // this is called dynamic method dispatch
        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
