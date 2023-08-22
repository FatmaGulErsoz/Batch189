package day11multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {


        //Bir Array'in elemanları eğer array ise bu arraylar multidimesion alarrays olarak adlandırılır


        //MultiDimansional Array nasıl oluşturulur?

        int a [][] = new int [3][2];//[[0,0],[0,0],[0,0]]

        //MultiDimensionla Array'lere nasıl eleman eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //MultiDimensional Array nasıl console yazdırılır?


        //MutiDimensional Array'leri yazdırırken toString() methodu değil, deppToString() methodu kullanırız

        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]


        //MultiDimensional Array'dan specific bir eleman nasıl yazdırılır?
        System.out.println(a[1][1]);//45

        //MultiDimensional Array içindeki bir array nasıl yazdırılır?
        System.out.println(Arrays.toString(a[1]));//[81,45]

        //Kısa yoldan MultiDimensional Array nasıl oluşturulur?
        String students [][] = {{"Ali","Can"},{"Çağatay"},{"Yaman","Fako","Emir"},{"Züber","Fatma"}};

        //Example 1: Yukarıda students araay'inde toplam kaç isim olduğunu bulunuz..

        int sum = 0;

        for ( String [] w :  students ) {
            sum= sum+ w.length;
        }
        System.out.println(sum);



        //Example 2: Yukarıdakı students array'inde içinde "m" harfi bulunan öğrencileri isimleriyle yazdırın


        //{{"Ali","Can"},{"Çağatay"},{"Yaman","Fako","Emir"},{"Züber","Fatma"}
        for ( String [] w : students){

            for ( String k : w   ) {

                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }






    }
}
