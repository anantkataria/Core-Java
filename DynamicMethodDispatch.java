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

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
