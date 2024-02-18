abstract class Car {
    public abstract void drive();
    public abstract void fly();
    public void playMusic() {
        System.out.println("playing music...");
    }
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("driving....");
    }
}

class UpdatedWagonR extends WagonR {
    public void fly() {
        System.out.println("flying WagonR...");
    }
}

public class Abstract {
    public static void main(String[] args) {
        //this is Dynamic Method Dispatch (check DynamicMethodDispatch.java), here though we are defining variable for parent type, it will have all the updated or implemented methods of child
        //this is not the case with normal Upcasting Downcasting (where there are no overridden methods, check UpcastingDowncasting.java)
        Car c = new UpdatedWagonR(); 
        c.drive();
        c.fly();
        c.playMusic();
    }
}
