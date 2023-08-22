package day11multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {
        //Example : Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int small = ages [0][0];
                                    //{ {15, 4}, {12, 43, 21} };
        for (int [] w : ages ){

            for (int k : w) {
                small= Math.min(small, k);

            }

        }
        System.out.println(small);

        int big=ages[0][0];

        for (int[] y: ages ) {
            for (int l:y ) {

                big=Math.max(big,l);

            }

        }
        System.out.println(big);

        System.out.println("big+small = " + (big + small));

    }
}
