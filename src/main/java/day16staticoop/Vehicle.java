package day16staticoop;

public class Vehicle {
    /*
    Child classtan bir object oluşturduğumuzda Constructorlar en üstteki parent classtan baslatılarak alta doğru calistiriliri

    Chil class'daki constructordan Parent class'daki constructor!a gidebilmek için super() kullanılır
    Parent class'da  biren fazla

     */
    public Vehicle(){
        System.out.println("Vehicle 1");
    }
    public Vehicle (int price) {
        System.out.println("Vehicle 2");
    }
}
