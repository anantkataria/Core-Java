class Mobile {
    String brand;
    int price;
    static String name;

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        // can't use instance variables (non static variables) directly in static methods,
        // need to have object as the argument to use it
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Static {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.show();
        obj2.show();

        Mobile.name = "SmartPhone";

        
        obj1.show();
        obj2.show();

        obj1.name = "Ahoy";

        
        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
