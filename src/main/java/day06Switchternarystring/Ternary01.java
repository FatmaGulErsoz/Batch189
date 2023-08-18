package day06Switchternarystring;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0



        int c = -4 ;
        //condtion?  true ise ===> : , false ise ===> ;
        int results = c<0       ? -1*c           : c ;
        System.out.println(results);

        //Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.

       int a = 13;
       int b = -7;

        Object resulr2 = (a>0 && b>0)  ||  (a<0 && b<0) ? a*b : "Farkli isaretli sayilari carpamiyorum";

       //Object java da bütün non-primirive (classlarin) ortak parent(baba) idir (===> HZ. Adem gibidir )
       //Object in partneri yoktur
       //farkli data tipleri için ortak bir variable oluşturmak istediğinizde data type olarak object kullaniriz,

























    }
}
