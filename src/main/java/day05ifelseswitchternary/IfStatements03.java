package day05ifelseswitchternary;

import java.util.EventListenerProxy;
import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {
        /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz...");
        int age = input.nextInt();

        if (age<0){
            System.out.println("Geçerli bir yaş giriniz...");
        } else if (age<5) {
            System.out.println("BEBEK");
        } else if (age<13) {
            System.out.println("ÇOÇUK");
        } else if (age<21) {
            System.out.println("GENÇ");
        } else if (age<31) {
            System.out.println("YETİŞKİN");
        } else if (age<31) {
            System.out.println("TANIMLANMAMIŞ");
        } else if (age>963) {
            System.out.println("zebani yaşı");

        }

    }
}
