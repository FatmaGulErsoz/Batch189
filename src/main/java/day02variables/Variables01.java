package day02variables;

public class Variables01 {

    public static void main(String[] args) {

        //Varriable nasil olusturulur?
        // Data Type + Variable name + Assignment Operator(Atma operatoru) + Variable Degeri + noktali virgul
             int           age               =                                   13               ;
             System.out.println(age);

        /*
        Java da temelde iki tip data vardir
        1)primitin data type:
            char, boolean, byte, short, int, long, float, double

        2)non-primitive data type:
            String
       */

        //1) primitive data types
        //char data type Ç  2 byte
        //örneğin ==> a, x, ?, 5
        //Ornek1: char data type'inde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        // Data Type + Variable name + assignment Operator(Atama operatoru) + Variable Degeri + noktali virgul
        //Note : char data type inda degerler her zamn tek tirnak icinde konulmalıdır
            char       isminIlkHarfi          =                  'F'                               ;

            //boolean data type: 1 bit
        //boolean'lar sadece iki farklı değer alabilir;true(dogru) veya false(yalnis)
        //Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.
         boolean isRetired = false;

         //bytte data type:
        //tam sayilar icindir hafizada 1 byte yer kaplar
        // byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
          byte ogrenciYasi = 15;

          //short data type
        //tam sayilar icindir hafiazda 2 byte yer kaplar
        //short: -32768 ile +32757 arasindaki tam sayilar için kullanilir
        //Ornek 4: Site nufusu icin bir variablr olusturup deger atayiniz
          short siteNufusu = 1234 ;

          //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2247483648 ile 2147483647 arasindaki sayilar icinidir
        //Ornek 5: ulke nufusu icindir bir variable olusturup deger atamasi yapiniz
        int ulkeNufusu = 1564587665;
        System.out.println(ulkeNufusu);
        //sout yaz enter a bas ==> System.out.println(); kodunu kisa yolu


        //long data type:
        //tam sayilar icinidir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036, 854,775,807 arasinda sayılar icindir.
        //0renk 6. insan vucudundaki hucre sayisi için variable olusturup deger atamasi yapiniz.
            long cellNumberİnHumanBody = 843425674738384747L;
        //Note: Eger long a atadiginiz deger int'lerin araliginida ise sonnda L koymaya gerek yok
        //ama int'lerin araligi disinda ise bunun long oldugunu sonunda Lkoyarak javaya söylemeliyiz
            long wightOfSun = 89898;

             // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun
        double weightCell = 0.0000000000000015;
        System.out.println(weightCell);
        //1.5E-14==> 1.5 carpi 10 üzeri -14 demektir



    }

    }

