package day03wrapperconcatenationoperators;

public class TypeCasting {
    public static void main(String[] args) {



        /*
        Numeric primitive data type larin birbirine donusturulmesiyle "Type Casting " denir
        Numeric (sayisal) data typelar     byte  -  short  -  int  -  long  -  float  -  double

        Note1 : Kucuk data type lerini buyuk data tiplerine cevirmeyi java otomatik yapabilir
        Bu isleme AutoWidening (Otomatik Genisletme) denir

        Note2 : Buyuk data type larini kucuk data type'larina cevirmek riskli bir istir
        Java bu riskli isleri otomatik olarak yapmaz. Bu islemi kod yazanlar yapar
        Bu isleme Expilicit Narrowing (Aciktan dararltma)

         */

        //Ornek : byte data type ini int data type ina ceviriniz (Auto Widening)

        byte age = 13;

        int ageInt = age;

        //Ornek : int data typeini short data type ina ceviriniz.

        int weight = 313;
        short weightShort = (short) weight;


    }

}
