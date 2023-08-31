package day16staticoop;

import java.time.LocalDate;

public class StaticBlock {

    //Bir variable oluşturduğunuzda değer atamazsınız o variable'ı initalixe etmediniz demektir.

    static double pi;

    //Bazen main method çalıştırılmadan önce variable'ların hazır hale getirilmesi gerekebilir
    //bu yüzden static block'lar kullanılır
    //Static variable'lar static blocklar içinde initialize edilirse o classın içinde herşeyden önce
    //hazır hale getirilmiş olur

    public static int price;
    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("main method");
    }
    //Birden fazla static blok varsa yukarıdan aşağıya doğru çalışır
    static {
        System.out.println("static blok 2");
        LocalDate currentDate =LocalDate.now();

        if (currentDate.getMonthValue()==2){
            price=1000;

        }else{
            price=2000;
        }
    }

    static{

        pi =3.14;
        System.out.println("static block 1");
    }








}
