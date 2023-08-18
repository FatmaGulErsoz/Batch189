package day09loops;

public class ForLoops2 {
    public static void main(String[] args) {
        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20

        double num = 28.587;

        //ondalıklı kısmı alabilmek için stringe çevirmeliyiz
        String sNum = String.valueOf(num);

        //Stringe çevirmiş olduğumuz sayıyı split() methodu ile bölerek ondalıklı kısmı alabiliriz
        String decimalPart = sNum.split("[.]")[1];

        //String tipinde olan decimalPart üzerinde matematiksel işlem yapabilmek için int'e çevirmeliyiz
        int intdecimalPart = Integer.valueOf(decimalPart);

        int sum =0;
        for (int i = intdecimalPart; i >0;  i = i / 10) {

            sum = sum + i % 10;

        }
        System.out.println(sum);






    }
}
