package day07stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98


        String  tv = "$456.99";
        String laptop ="$875.99";

        String newtv = tv.replace("$","");
        String newLaptop = laptop.replace("$","");


        Double  totalPrice = Double.valueOf(newtv) + Double.valueOf(newLaptop);

        //Example 2: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız.
        //          "       fatmA  ErSöZ      " ==> AC
        //trim() methodu bir stringin bas ve sonundaki space characterlerini siler, aradaki spaceleri silmez

        String name ="          ali cAN       ";
        char first =name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);

        System.out.println(""+first+last);


        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        // karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail
        //indexOf ("@")methodu parantez içine yazılan characterin ilk görünümünün indexini verir

        String a = "abce@gmail.com";
        System.out.println(a.substring(5,10));//gmail

        int startingIndex = a.indexOf("@")+1;
        int endingIndex = a.indexOf(".");

        String companyName= a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);


    }
}