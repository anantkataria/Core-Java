class A { 
    @SuppressWarnings("unused")
    private int age;

    public void show() {
        System.out.println("In Show");
    }

    class B {
        public void bConfig() {
            System.out.println("In B Config");
        }
    }

    static class C {
        public void cConfig() {
            System.out.println("In C Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        
        // you can't directly declare B
        // you need an object of A to make B like following
        A.B obj1 = obj.new B();
        obj1.bConfig();

        // for inner static class, we don't need an object of A to be made
        A.C obj2 = new A.C();
        obj2.cConfig();

        // Also, you can't create static outer class since it does not make sense
        // you can only use static class as inner classes inside the normal classes

    }
}
