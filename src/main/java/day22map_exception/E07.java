package day22map_exception;

public class E07 {
    public static void main(String[] args) {
        printAge(63);
        printAge(-5);


    }

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }


    }

    /*
    Throw keyword bir methodun body'si içinde isrediğimiz yerde, istediğmiz koşullar için istediğimiz kadar Exception atamamızı sağlar
    Throw yazıldıktan sonra bir exception class objecti oluştuulur
    Exception Class constructor inin par<antezi içine istediğimiz Exception mesajını yazabiliriz

     */


}
