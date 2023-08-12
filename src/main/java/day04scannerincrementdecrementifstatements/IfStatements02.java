package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {



        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        int num = input.nextInt();



        //1. yol:
        if ( num % 2 == 0 ) {

            System.out.println("çift sayi");
        }

        if ( num % 2 != 0) {

            System.out.println("tek sayı");


        }








    }


}
