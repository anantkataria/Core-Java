interface A {
    //all methods added in the interface are public, static by default
    void show();
    void config();

    //all variables added in the interface are final, static by default
    int age = 44;
    String area = "Mumbai";
}

interface X {
    void run();
}

// interface - interface : "extends"
// class - class : "extends"
// class - interface : "implements"
interface Y extends X {

}

// class has to implement all methods of all interfaces for it to be concrete class, 
// otherwise it will be an abstract class
class B implements A, Y {
    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }

    public void run() {
        System.out.println("In run");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show(); 
        obj.config();
        // obj.run(); this will not work because run() method is not part of interface A
        System.out.println(A.age); //static variables
        System.out.println(A.area);

        Y obj1 = new B();
        // obj1.show();
        // obj1.config(); these two methods will not work for obj1 since it is of type Y and interface Y only knows about run() method
        obj1.run();

        B obj2 = new B();
        obj2.show();
        obj2.config();
        obj2.run();
    }
}
