package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. adim : Scanner Class'tan object olustur.
        Scanner input  = new Scanner(System.in);


        //2. adim : Kullanıcıya ne istediginize dair mesaj veriniz.
        System.out.println("lütfen yaşınızı giriniz");


        //3. adim : Uygun method'u kullanarak kullanicinin verdiyi data yı memory e yerlestireiniz.
        byte age = input.nextByte();


        System.out.println(age);



    }
}
