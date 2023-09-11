package day21maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("Ahmet",41);

        //Keyi tekraralı kullandığınızda hata vermez, en son verilen entry'nin değerini kabul eder.
        stdAges.put("Veli",35);
        System.out.println(stdAges);
        //replace() methodu valeu'ları keylri kullanarak opdate etmeye yarar
        stdAges.replace("Tom",39);
        System.out.println(stdAges);

        //replace("Tom",15,41); methodu map içinde key olarak Tom ve Valuesu 39 ise 41 e dönüştürüyor
        stdAges.replace("Tom",15,41);
        System.out.println(stdAges);

        //pufIfAbsent("Ayşe",77); methodu map'te Ayse key olacak yoksa Map 'a ekler var ise eklemez
        stdAges.putIfAbsent("Ayşe",77);
        System.out.println(stdAges);

        //get() ve getOrDefault() methodalrı eğer aranan eleman map'te var ise ikiside ayni isi yapar
        //valeu'larını verir
        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("Tom", 0));

        //eger eleman map'ta yok ise get methodunu null verir
        //getOrDefault() methodu ise sizin belirttiğiniz değeri verir
        System.out.println(stdAges.get("Jerry"));//nul
        System.out.println(stdAges.getOrDefault("Jerry", 0));//0

        //containsValeu()metohdu valeu'ların içerisinde aranan değer olup olmadığını kontol eder
        System.out.println(stdAges.containsValue(19));//true
        System.out.println(stdAges.containsValue(99));//false

        //containsKey()metohdu valeu'ların içerisinde aranan değer olup olmadığını kontol eder
        System.out.println(stdAges.containsKey("TOM"));//false
        System.out.println(stdAges.containsKey("Tom"));//true

        //remove("Tom"); methodu key kullanılarak entry silmeye yarar
        stdAges.remove("Tom");
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=77, Veli=35, Ali=18}

        //remove("Can" ,19); methodu hem key hemde valeu'u kontrol eder eslesirse siler yoksa silmez
        stdAges.remove("Can",19);
        System.out.println(stdAges);//{Ahmet=41, Ayşe=77, Veli=35, Ali=18}


    }
}
