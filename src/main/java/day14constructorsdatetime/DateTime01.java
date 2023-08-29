package day14constructorsdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
     //İçinde bulunduğumuz zaman dilimindeki tarihi verir
                                //Alttaki kod dinamik bir koddur.
       LocalDate myCurrentDate = LocalDate.now();//2023-08-28
        System.out.println(myCurrentDate);

        System.out.println(myCurrentDate.getMonthValue());//8
        System.out.println(myCurrentDate.getYear());//2023
        System.out.println(myCurrentDate.getDayOfMonth());//28
        System.out.println(myCurrentDate.getMonth());//AUGUST
        System.out.println(myCurrentDate.getDayOfWeek());//MONDAY

        //İleriki tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusDays(3).plusMonths(4).plusYears(1));//2024-12-31

        //Geçmiş tarihe nasıl gidilir?
        System.out.println(myCurrentDate.minusYears(10).minusMonths(7).minusDays(35));//2012-12-24
        //FAKOSEKOEKO'NUN DG'Sİ HAHAHAHAHAHAHHAA!


        //Specific bir tarih objesi nasıl oluşturulur?
        LocalDate date1 = LocalDate.of(1980,8,10);
        LocalDate date2 = LocalDate.of(1990,8,10);
        System.out.println(date1);//1980-08-10

        boolean r1 = date1.isBefore(date2);
        System.out.println(r1);//true

        boolean r2 = date1.isAfter(date2);
        System.out.println(r2);//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in given order");

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println("Invalid date");
        } else {
            System.out.println("Enter time for the ticket");
        }


        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter year, month and day numbers in the given order");
        int f = input.nextInt();
        int g = input.nextInt();
        int e = input.nextInt();

        LocalDate date = LocalDate.of(f,g,e);
        System.out.println(date.getDayOfWeek());
    }
}
