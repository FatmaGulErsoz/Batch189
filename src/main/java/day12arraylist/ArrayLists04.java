package day12arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {
    public static void main(String[] args) {

        //Bir list oluştururken kısa yol

        List<Integer> list = Arrays.asList(1,3,5,9,7);
        // list.remove(0);
        // list.add(5);
        // list.clear();

        list.set(0,5);
        System.out.println(list.size());
        System.out.println(list);

        /*Arrays.asList() methodunu kullanarak bir list oluşturusanız listteki eleman sayısını değiştiren methodları kullanamazsınız
        ama mesela set() yada size() gibi methodları kullanabilirsinz
         */


    }
}
