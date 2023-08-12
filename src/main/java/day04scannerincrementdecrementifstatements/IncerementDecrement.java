package day04scannerincrementdecrementifstatements;

public class IncerementDecrement {
    public static void main(String[] args) {

        //Increment :
        int a = 5;
        System.out.println(a);

        a = a + 2;//7
        System.out.println(a);

        a += 2;//9
        System.out.println(a);

        //Decrement
        int c = 8;
        System.out.println(c);

        c = c - 3;//5
        System.out.println(c);

        c -= 3;
        System.out.println(c);//2

        //Increment 2

        int d = 6;
        System.out.println(d);//6

        d = d * 2;
        System.out.println(d);//12

        d *= 2;//24
        System.out.println(d);


        //decrement 2
        int e = 24;
        System.out.println(e);//24

        e = e / 2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        //1 ile increment
        int f = 13 ;

        // f=f +1;
        // f+=1;
        f++;

        //1 ile decrement
        int h = 9;
        // h=h - 1;
        //h -= 1;
        h--;

        //post-increment / pre-increment

        int i = 10;
        int k= i++;


        System.out.println(k);//10   i arttırılnadan k ya koyulduğu için k nin degeri 10 olur
        System.out.println(i);//11  i satir sonunda artirildigi icin 11 olur


        int m = 15;
        int n = ++m;

        System.out.println(m);//16   m satir sonunda arttirildigi için m nşn değeri 16 olur
        System.out.println(n);//16    m arttırıldıktan sonra n ye konuldugu inin n nin degeri  de 16 olur


        //Ornek

        int p = 17 ;
        int r = p--;

        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;

        System.out.println(s);//19
        System.out.println(t);//19





    }
}
