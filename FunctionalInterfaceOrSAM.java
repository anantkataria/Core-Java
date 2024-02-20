// after java 8, we can also define normal methods in the interface
// before java 8, we could only define abstract methods in it

// there are three main types of interface
// 1) Normal interface : interface with more than one abstract methods
// 2) functional interface (SAM - Single Abstract Method) : interface with only one method and it is abstract
// 3) Marker interface : interface with no methods whatsoever. This interface is used to give message to compiler regarding granting permission, for example serialization etc..  


// by using this annotation we are making sure that our interface has only one method signature.
@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    int add(int i, int j);
}


public class FunctionalInterfaceOrSAM {
    public static void main(String[] args) {
        
        // here we are using anonymous class to implement over the interface A
        A obj = new A() {
            public void show() {
                System.out.println("In show");
            }
        };
        obj.show();

        // same thing can be done using a lamda function in case of functional interface with much lesser code
        // note: if you have multiple statements and not just one line of code, you'll need curly braces
        A obj1 = () -> System.out.println("In show");
        obj1.show();

        // lamda expression for a function with arguments and return
        B obj2 = (i, j) -> i+j;
        System.out.println(obj2.add(2, 3));
    }
}
