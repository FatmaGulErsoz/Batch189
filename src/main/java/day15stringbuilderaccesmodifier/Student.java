package day15stringbuilderaccesmodifier;

public class Student {

    //Acces Modifier
    /*
    1)public
    2)protected
    3)default
    4)private

    public>protected>dfeault>private

    public    ==>public olanlar her class'dan kullanılabilir
    protected ==>protected olanlar baska package'larda kullanılmaz, ancak başka package'larda
              child  classlar içinde kullanılabilir
    deault    ==>default olanlarolanlar başka package'lardan kullanılamazlar
    private   ==>private olanlar sadece oluşturdukları class içinde kullanılabilirler

    "protected ile default" arasımdaki farkı söyleyiniz
Note ==> protected olanlar baska package lardan kullanilamaz ancak ancak baska package larda
                        child classlar icinden kullanilabilir
                  default olanlar baska package lardan kullanilamazlar
     */
    //her class tan kullanilabilir
    public String stdName ="Ali Can";

    //protected olanlar baska package dan sadece child classlardan gorulebilir
    protected String address = "Istanbul";

    //default accses modifier larda default keyword yazilmaz
    //default olanlar baska package lardan kullanilamazlar
    String email = "alican@gmail.com";

    //private olanlar sadece olusturulduklari class icinde kullanilabilirler
    private  String ssnId="1234567891";











}
