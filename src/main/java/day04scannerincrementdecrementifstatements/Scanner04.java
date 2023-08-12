package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bes basamaklı bir sayı giriniz...");
        int num = input.nextInt();

        //bir tamsayıyı 1000 e bölersek son uc basamagı silmis oluruz
        int firstTwo = num /1000;

        // % ==> modulus operatoru solunda bulunan sayinin saginda bulunan
        //sayiya bolumunden kalani verir
        //dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir

        int lastTwo = num%100;

        System.out.println(firstTwo + lastTwo);





}





}
