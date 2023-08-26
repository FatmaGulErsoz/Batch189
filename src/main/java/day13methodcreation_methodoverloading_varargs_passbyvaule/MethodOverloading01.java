package day13methodcreation_methodoverloading_varargs_passbyvaule;

public class MethodOverloading01 {

    public static void main(String[] args) {
        toplama(3,5);

    }//main kapatma parantezi

    public static void toplama(int a, int b){
        System.out.println(a + b);
    }
    public static void toplama(double a, double b){
        System.out.println(a + b);
    }
    public static void toplama(double a, int b){
        System.out.println(a + b);
    }
    public static void toplama(int a, double b){
        System.out.println(a + b);
    }
    public static void toplama(int a, int b, int c){
        System.out.println(a + b +c) ;
    }

    /*
    1)Method Overloading yaparken method ismi değiştrilmez.
    2)Method Overloading yaparken parametreler değiştirilir.
      a)Parametre değiştirilirken parametrelerin data typeları değiştirilebilir
      b)Parametre değiştirilirken parametrelerin data typeları farklı ise yer değiştirebilir
      c)Parametre değiştirilirken parametrelerin sayısı değişebilir
    3)Java için ismi ve parametreleri aynı olan iki method tamamıyla aynıdır
      Bu yüzden ismi ve   parametre Method Signature olarak adlandırılır
    4)Method overloading oluşturuluken return type'ı değiştirmenin hiçbir etkisi yoktur
    5)Method overloading oluştururken acces modifire'i değiştirmenin hiçbir etkisi yoktur
    6)Method overloading oluştururken static veya non-static yapmanin hicbir etkisi yoktur
    7) Method overloading olustururken body i  degistirmenin hicbir etkisi yoktur

    8) private methodlar overload edilebilir
    private olmak baska classlara gidildiginde problem olur, biz overloading ayni classta yapariz

    9) static methodlar overload edilebilir
    overloading yapmak icin method isimini degistirmeden method signature i degistiririz, dolayisiyle method signature degistirildiginde
    yeni bir method olusturmus oluruz bu nedenle static olmasi bir seyi degistirmez
     */


}//Class kapatma parantezi
