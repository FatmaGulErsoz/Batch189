package day11multidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Md02 {

    public static void main(String[] args) {

        //Example : İki boyutlu bir Array'i tek boyultu bir Array'a çeviriniz.
        //int numbers [][] = {{5,4},{2,3,2}}; ==>{5,4,2,3,2}

        int numbers [][]= {{5,4},{2,3,2}};

        //1.Step : İki boyutllu array'de kaç eleman olduğunu bulan kodu yazmalıyız
        int toplamElemanSayısı=0;
        for (int[] w : numbers){
            toplamElemanSayısı=toplamElemanSayısı+w.length;
        }
        System.out.println(toplamElemanSayısı);

        //2.Step : Tek boyutlu array'i iki boyutlu array'in elema sayısını kullanarak oluşturmalıyız.
        int newArr [] = new int[toplamElemanSayısı];

        //3.Step : İki boyutlu array'deki elemanları ek boyutlu array'e transfer etmeliyiz

        int idx = 0;

        for (int [] w: numbers) {
            for (int k :w){
                newArr[idx]=k;



                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));




    }
}
