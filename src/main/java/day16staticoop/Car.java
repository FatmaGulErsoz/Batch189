package day16staticoop;

public class Car {
    public static class car extends Vehicle {
        public car() {
            super();
            System.out.println("Car 1");
        }
        public car(String make){
            super(1000);
            System.out.println("Car 2");
        }
    }
}
