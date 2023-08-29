package day15stringbuilderaccesmodifier;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 =  new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();
        System.out.println(sb1);//ysae si avaJ

        //Verilen index'deki caharacteri siler
        sb1.deleteCharAt(0);
        System.out.println(sb1);//sae si avaJ

        //Başlangıç indexinden bitin indexine kadar(hariç) olan characterleri siler
        sb1.delete(0,3);
        System.out.println(sb1);// si avaJ

        //Replace (0,3,"X"); 0 dahil 3 hariç olmak üzere indexleri alır ve yerine x koyar
        sb1.replace(0,3,"X");
        System.out.println(sb1);

        sb1.insert(2,"999");
        System.out.println(sb1);


        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        /*
        compareTo(); iki StringBiulder'ı baştan başlayarak hafr karf karşılaştırır
        ilk harfler aynı ise ikinci harflere geçer
        ikinci harfler aynı ise üçüncü harflere geçr...
        ve ilk farklı olan harfe gider, farklı olan iki harfin ascii kodları arasındaki farkı verir

        sonuç=0 ise alfebetik olarak aynı sıradalar demektir
        sonuç=-1 ise sb2 ve sb3 den alfabetik olarak önde demektir
        sonuç=1 ise sb2 sb3 den alfabetik olarak geride demektir
         */

        //String class da var olan ama StrinBiulder class da var olmayan(split() method gibi) methodlara
        //ihityaç duyduğumuzda
        String str  = sb1.toString().toUpperCase();
        System.out.println(str);//X 999AVAJ

        //String nasıl StringBiulder'a çevrilir
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);//


        /*
        1) StringBuffer java sa string üreten bir diğe classatır.
        StringBuffer javanın string üretmek için oluşturduğu classtır

        2)StringBuffer, StringBuilder'a çok benzer, yani ikiside "mutable" string üretir
        3)StringBuffer "mutli-thread" 'dir, ama StringBuilder "multi-thread" değilidir.
        4)StringBuilder "multi-thread" olmadığı için StringBuffer dan daha hızlı çalışır.
        5)multi-therad yapılırken yapılan işlerin sıralaması önem arz eder,yapılan işleri mantıklı bir sıraya koymak
        "synchroization" olarak adlandırılır.
        StringBuffer multi-thread olduğu için aynı zamana synchronized dir

              3 tane String oluşturan class öğrendir;
              1) immutable string lazımsa ==> String class
              2)mutable string lazımsa, StringBuilder veya StringBuffer
                            a)StringBuffer'ı multi-thread gerekirse kullanırız
                           b)StringBuilder'ı multi-thread gerekmezse kullanırız


         */

        //StringBuffer nasil olusturulur?
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java


    }
}
