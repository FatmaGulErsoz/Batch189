package day13methodcreation_methodoverloading_varargs_passbyvaule;

public class MethodCreation01 {
    public static void main(String[] args) {

       int carpmaSonucu = multiply(3,5);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2, 3, 4));

         print("Ali Can");

    }//Main method kapanış parantezi

    //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
    protected static int multiply(int a, int b){
        return a*b;
    }

    //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
    private static int firstTwoMultiplyThirdAdd(int f, int g, int e) {
        return f*g+e;
    }

    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print (String str ){
        System.out.println(str);

    }
    //Eğer bir method yeni bir data üretmiyor ise return type'ı void olur.
    //Methodun return type'ı void ise method body içinde return keyword yazılmaz.
    //Note: Method oluşturmada kullanılan variable'lar parametreler "parameters" olarak adlandırılır.
    //      Method call da kullanilan degerlere Argumanlar "Arguments" denir.





























}//Class lapanış parantezi











