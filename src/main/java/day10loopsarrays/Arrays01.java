package day10loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;

        a=7;
        a=5;

        //Array nasil olusturulur?
        String stdNames [] = new String[5];

        //Arrayler nasıl yazdırılır?
        System.out.println(Arrays.toString(stdNames));

        //to String methodunu kullanmadan sadece array ismini yazdırırsanız java o array'in adresini yazdırır..

        //Array'e eleman ekleme nasıl yapılır?
        stdNames [2] = "Fahri";
        stdNames [4] = "Nur";
        stdNames [3] = "Fatma";
        stdNames [1] = "Fako";
        stdNames [0] = "Züber";
        System.out.println(Arrays.toString(stdNames));

        //Array'den specific bir elemani almak?
        System.out.println(stdNames[1]);//Fako<3

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String cities [] = new String[5];
        cities[0] ="Miami";
        cities[1] ="Erzurum";
        cities[2] ="Adana";
        cities[3] ="Skopje";
        cities[4] ="Isparta";

        //Note: String'lerde kullandığımız lenght() methodtur,
        //Array'lerde kullandığımız lenght veriable'dır.
        int totalChar=0;
        for (int i = 0; i < cities.length; i++) {
            totalChar = totalChar+cities[i].length();
        }

        System.out.println(totalChar);


        //2.yol "for-each loop" (enhanced loop):

        int sum = 0;


        for (String w : cities){
           sum = sum+ w.length();
        }
        System.out.println(sum);

    }
}
