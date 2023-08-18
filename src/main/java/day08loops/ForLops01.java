package day08loops;

public class ForLops01 {
    public static void main(String[] args) {

        //Example: Ekrana 5 kere hi yazdırınız.

        //1. yol :  ==> Tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2. yol:
        //a) for loop

        /*
        for (Baslangıç Degeri;Loop çalışma sarti ;Artma/ Azaltma ){

        }
        */

        //Başlangıç değeri;Loop çalışma sarti ; Artma/Azaltma
        for (       int i=     1 ;       i<526        ;  ++i){
            System.out.println("Hi..");
        }

        for (           int i=   1;      i<99        ;  ++i){
            System.out.println("Şampiyon Galatasaray, Sezonun En Büyüğü Oluyor GALATASARAY");
        }

        //Example: 11'den 14'e kadar tum tamsayiları ekrana yazdıran kodu yaziniz.
        for (int  i=11; i<15 ; i++){
            System.out.println(i);
        }


        //Example  40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz

        for (  int i =40  ; i>22  ; i++  ){
           if (i%2 == 0){
               System.out.println(i);
           }
        }
    }
}
