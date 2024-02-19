// enum is also one type of class (everything in java is a class (except primitive data types int, char, float, boolean are not classes))
// so enum can have variables, methods...
// also enum classes can not be extended (like normal classes in java)
enum Laptop {
    //these are basically objects of the class Laptop
    Macbook(2000), XPS(2200), Surface, Thinkpad(1500);

    // always keep instance variables private
    // and create getters and setters to access them
    private int price;

    // default private constructor
    // normally constructors are public, but in case of enum, we define the objects inside the class itself, hence private constructor works here.
    // creation of the object 'Surface' will use this constructor
    private Laptop() {
        price = 500;
    }

    // creation of the object 'Mackbook', 'XPS', 'Thinkpad' will use this constructor
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class Enum {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        // .values() method here is from the super class Enum, which is parent for any enum class that we define
        for(Laptop lap1 : Laptop.values()) {
            System.out.println(lap1 + " : " + lap1.getPrice());
        }

        // use of switch case with enum
        switch (lap) {
            case Macbook:
                System.out.println("Its a Macbook");
                break;
            case XPS:
                System.out.println("Its an XPS");
                break;
            case Surface:
                System.out.println("Its a Surface");
                break;
            default:
                System.out.println("Its a Thinkpad");
                break;
        }
    }
}
