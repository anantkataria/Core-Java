class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B show");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        A obj = new B(); //upcasting of B to its parent A
        obj.show1();
        // obj.show2(); this will not work bcz obj type is A, which does not have show2() method

        B obj1 = (B) obj; //this is downcasting of obj of type A to type B
        obj1.show1();
        obj1.show2(); //obj1 is essentially B, so it will have both show1 and show2 methods
    }
}
 