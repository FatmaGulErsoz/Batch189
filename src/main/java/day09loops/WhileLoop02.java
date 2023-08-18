package day09loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {


        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/
        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosunu görmek için bir sayı giriniz...");
        int num = input.nextInt();

        int i =1;

        while (i<11){

            System.out.println(num+" x " + i + "=" +( num * i ));


            i++;
        }
        System.out.println();




        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321
        int k = 313;


        //sayiyi rahatlıkla index ler ile ters cevirebilmek için stringe cevirdik
        String m = String.valueOf(k);//"313"

        String reversed = "";

        int n = m.length()-1;
        while (n>=0){
            reversed = reversed+  m.charAt(n);

            n--;
        }
        System.out.println(reversed);




        if(m.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }




























    }
}
