package day12arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList < Integer> ages = new ArrayList<>();

        //ArrayListlere nasıl eleman eklenir?
        ages.add(5);
        ages.add(7);
        ages.add(19);
        ages.add(1,313);
        ages.add(3,777);
        ages.add(999);

        ArrayList < Integer> newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        ages.addAll(0,newAges);

        System.out.println(ages);//[1, 2, 3, 5, 313, 7, 777, 19, 999, 1, 2, 3]

        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //burada get mothodu kullanılarak elde ettiğimiz datayı görünür yapmak için int sepetne ekledik, böylece methodların return typlerına bır vurgu yaptık
        int el = ages.get(2);
        System.out.println(el);//3

        //bazı methodlar bir şey yapar, return etmez, set methoduna index girerek girmiş olduğumuz index teki eleman güncellemesini sagladık,return typaina ihtiyaca duymadik
        //bu nedenle herhangi bir data typei icerisinde store etmedik
        ages.set(1,313);
        System.out.println(ages);//[1, 313, 3, 5, 313, 7, 777, 19, 999, 1, 2, 3]


        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list);//[23, 24, 12, 9, 3]


        //[23, 24, 12, 9, 3]
        for (Integer w : list) {

            if (w % 2 != 0) {
                list.set(list.indexOf(w)  ,11);

            }
        }
        System.out.println(list);










    }
}
