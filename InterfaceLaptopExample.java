interface Computer {
    void code(); //by default all methods in an interface are public and abstract
}

// the class that implements interface should provide definitions for all methods of interfaces
// otherwise the class becomes abstract itself
class Laptop implements Computer {
    public void code() {
        System.out.println("Write, Run, Debug...");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Write, Run, Debug... : Faster");
    }
}

class Developer {
    public void devApp(Computer c) {
        c.code();
    }
}

public class InterfaceLaptopExample {
    public static void main(String[] args) {

        // developer requires a computer to code applications
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer anant = new Developer();
        anant.devApp(lap); // anant is using laptop computer to develop application
        anant.devApp(desk); // anant is using desktop computer to develop application
    }
}
