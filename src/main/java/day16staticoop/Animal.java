package day16staticoop;

public class Animal {
    /*
    1)Inheritance
    2)Polymorphism
    3)Encaosulation
    4)Abstraction

     */

    //1) Inheritance
    /*
    Özellikler bir class'tan başka bir clss'a alan bir kavramdır,
    Mesela; siz bir class oluşturucaksınız ama daha önce oluşturulmuş bir class sizin istediğiniz özelliklerin bir çoğu kapsıyor.
    O zaman yeni oluşturduğunuz class'ı özelliklerini kullanmak istediğiniz class'a child yaparız

    1)JInhwntiance sayesinde;

       a) Code tekrarlarından kurtuluruz
       b) Code tamiri(maintenance) kolay olur
       c) Child Class'ları daha atomik yapmış oluruz

   2)Bir claas'ı başka bir class'ın chil class'ı yapmak için extends keywordumu kullamırız
   3)Chil class objectleri Parent class'tan method ve veriable'ları kullanabilirler
   4)Parent class objectleri chil classtanmethod ve variable lari kullanamazlar
   5)Java da bir class'ın sadece bir tane parenti olabilir, çoklu parent a Multiple Inheritance derler
   tekli parent'a Single inheritance derler, java Multiple inheritance'ı destelemez, single inhertiance kullanır
   6)Apartman şeklindeki inheritanceyapısına "Multilevel inhertiance " denir
   ve javaMultilevel inheritance " i destekler
   7) Object class her classin parent idir. java da object class hari her classin parenti vardir
   8) java da parent tan child a olan ilisikilere HAS-A Relationship denir
      java da chlid tan parent a olan ilisikilere IS-A Relationship denir
   9) java da her classin bir tane default constructor i vardir ama bu default constructor classin icinde gorunmez
        cunku default constructor "Object Class"icindedir.
     */

    public void eat(){
        System.out.println("Animals eat..");
    }
    public void drink(){
        System.out.println("Animals drink..");
    }

}



