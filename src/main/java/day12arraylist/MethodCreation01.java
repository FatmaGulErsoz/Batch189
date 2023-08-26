package day12arraylist;

public class MethodCreation01 {
    public static void main(String[] args) {
        /*
        Javada method nasıl oluşturulur?
        ==>main methodun dışında classın içinde oluşturulur
        1)Acces Modifier + return type + Method ismi + () + {}
        2)Method oluşturmak methodu çalıştırmak için yeterli değildir

         */
        //Method call: main method içinde bir method kullanılmasına method call denir
        int sonuc = toplamaYap(13,12);
        System.out.println(sonuc);



    }//Main method kapanışı


        //Örnek1: Toplama işlemş yapan bir methd oluşturunuz
        public static int toplamaYap(int a, int b){
              return a+b;

        }




}//Class kapanış parantezi
