package day19oop;

public interface Ac {
/*
  1) Bir interface'i bir class'ın parent'ı yapmak
  için implements keywordu kullanırız
  2) Java parentlar  class olduğnda multiple parent'a müasde etmez
  ama biz bazen multiple parenta'a ihtiyaç duyabiliriz
  Bu ihtiyacı gidermek için java interface isimli yenş bir yapı oluşturdu
  ve bu yapı sayesinde bir classın çoklu interface parenti olabiliyor
  3) İnterfacelerin içine conctere method konlumaz, çünkü concrete methodlarda
  bir çok detay içerir ve child classlarda kafakarışklığına sebep olur
  Halbuki sadece yapılması geekn işi söyleyip nasıl yapılacağını childad bırakırsanız child
  classın kafa karışıklılığını engellemiş olursunuz
  4) İnterfacelerdaki tüm methodlar otomatik olarak public'dir, abstracttır static değildir
  5) İnterfaceler concrete methodu içermezler, dolayısıyla interfacein içindeki abstreacter
  methodlar chil class tarafından kullanılması mecburidir. Bu yüzden interfacelere "to do list" de denir
  6) Coklu interface parentların herbirinin içinde aynı isimli metgodlar koyabiliriz
  Mesela AC nin Engine'in ve Securty'nin içinde run() methodu koymak gibi
  Child class herhangi birini override ettiğinde hepsini override etmiş gibi olur sonrada body'yi
chlic classdayazarak uygulamasini yapmis olur
  7) interfacelerdeki tum variable lar otomatik olarak (default) olarak final dir, bu yüzden interface icindeki variable i
  olusturdugumuzda mutlaka deger atamasi yapmalisiiniz
  8) interfacelerdeki tum variable lar otomatik olarak (default) olarak final, public ve static dir,
  interfacelerde variable cagirirken interface adini kullanarak cagiririz bu hem static olmanin geregidir
  hemde okunurlugu artirir
  9) Normalde interface icine concrete method konulamaz ama bazi özel durumlarda conceret method koymak gerekirse
     a) default keywordunu kullanarak bunu yapabiliriz
     b) static keywordunu kullanarak bunu yapabiliriz

   ==>  static keywordunu kullanarak olusturdugumz concrete methodlara ulasmak icin
     object olusturmaya gerek yoktur. Interface ismi yeterlidir

   ==>  default keywordunu kullanarak olusturdugumuz concrete methodlara intrefacein child clasindan
   object olusturarak ulasilabilir

   10) interface lerden object olusturulamaz. interfacelerin constructor i yoktur

        child               parent
        class               class       ==>  extends
        interface           interface   ==>  extends
        class               interface   ==> implemenets
        interface           class       ==> olamaz

   11) Abstract Class ile interface arasindaki farklar nelerdir?
     a) Abstract classlar hem abstract method hemde concrete methodlar icerebilir
     fakat interfaceler abstract method icerir
        Ama interfacelerde istersek default ve static keywordllerini kullanarak conceret method olusturabiliriz

     b)Abstract classlar multiple inheritance i desteklemez
     ama interface ler destekler

     c)   Abstract classlar icinde her turlu variable olusturulabilir interfaceler icindeki variabllar
     public static ve final olmak zorundadir


     d) interface concrete classin childi olamaz ama absstract class classin childi olabilir

     e) abstract classlarda constructor vardir ama object uretemez, intrefaclerde constroctur yoktur
     bu yuzden object uretilemez

*/

    public static final int price =2000;
    void cool();

    void run();

    default void eco(){
        System.out.println("uses gas less...");


    }








}
