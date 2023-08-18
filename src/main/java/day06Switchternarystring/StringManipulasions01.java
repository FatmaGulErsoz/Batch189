package day06Switchternarystring;

public class StringManipulasions01 {

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1 : "s" String'inde kullanılan character sayisini bulunuz.
        int sLenght = s.length();
        System.out.println(sLenght);

        //Example 2: "s" String'indeki ilk indexte bulunan character'i ve son indexte bulunan karakteri aliniz.

        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        char lastChar = s.charAt(11);
        System.out.println(lastChar);//y

        char lastChar2 = s.charAt(s.length()-1);
        System.out.println(lastChar2);//

        //not: s.charAt(0) kodu bize her zaman ilk karakteri veiri çünkü index 0 dan başlar
        // note: s.charAt(s.length()-1) charAt method parantezinde almak isrediğimiz indexi vermemiz gerekiyor
        //s.length()-1 ile her zaman son indexi alabilmeti saglamış olduk


        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        String s1 = s.substring(0,4);
        System.out.println(s1);//Java

       //example 4 : "s" String'indeki "is" kelimesini alınız
       String s2 = s.substring(5,7);
        System.out.println(s2);//is

       //Example 5; "s" String'indeki "easy" kelimesini alınız
        String s3 = s.substring(8,12);
        System.out.println(s3);//easy

        //2.yol
        //Bir karakterden başlayarak sonuna kadar almak isterseniz o zaman tek parametreyli methodu kulllanabilirsiniz
        String s4 = s.substring(8);
        System.out.println(s4);


        //Example 6: "s" String'inde easy kelimesinin var olup olmadığını kontrol ediniz
        boolean isExist = s.contains("easy");
        System.out.println(isExist);//true

        //Example 7: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Example 8: "s" String'inin "easy" ile bitip bitmediğini kuntrol ediniz.
        boolean sub8=s.endsWith("easy");
        System.out.println(sub8);//true




    }
}
