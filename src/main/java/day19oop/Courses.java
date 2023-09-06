package day19oop;

public abstract class Courses {
    //Abstraction
    /*
    1) Eğer bir class'tan obje oluşturulmasını istemiyorsak ve bu classı sadece chil classların yapmak zorunda oldukları
    görevleri belirlemek iççin kullanılıyorsa "Abstraction" yaparız
    2) Bazen parent class'daki methodun bodysi hiçbir child class tarafından kullanılmaz. Bu durumda parent'daki methoda
    body yazmak hiç kullanılmadığı için mantıklı değildir. Bizde o methoda body yazarız
    3) Methodun body'sini yazmayınca java bize hata verir, bizde abstract keyword'ünü kullanarak javaya
    bu methodun body'si olmayacak deriz.
    4) Abrtract keyword'ünü kullanınca elde ettiğimiz abstract method normal classslara konulmaz,
    o yüzden class'ıda abstract yapmalıyız
    5) Parent'daki method abstract ise bütün concrete child classlar o methodu override etmek zorundadır
    Bu yüzden tüm childlar için mecburi olmasını istediğimizmethodları abstract yaparız
    6) Body'si olan methodlaar (concrete) abstract classların içinde yazılabilir. Abstract methodlarconcrete
    classların içine yazılmazlar. Concrete methodlar child classlarlar tarafından ovveride edilmek zorunda değiillerdir
    7) Abstract keyword ile method body bir method 'da aynı anda kullanilamaz
    8) final methodlar abstract olamazlar. final methodlar override edilemezler, halbuki abstract methodlar
    override edilmek icin olusturulurlar. Bu celiskidir dolayisiyla java abstract methodlarin final olmasina izin vermez
    9) abstract classlarin icinde abstract methodlar olur, abstract methodlar body si olmadigindan eksik methodlar gibi düsünülebilir
    Yani abstract class icinde eksik yapi barindirir. Bu nedenle java applicationu korumak icin
    abstract classlardan object olusturulmasina izin vermiyor
    10) abstract classlarin constructor lari vardir ama object olusturamazlar
    11) abstract class in abstract childi veya concrete childi olabilir. Eger child abstract
    ise abstract methodlari override etmek zorunda degildir, concrete ise override etmek zorundadir
    12) abstract methodlar private olamazlar cunku child classlar abstract methodlari override etmek zorundadirlar
    private yapinca kullanima kapali olur, Bu celiskidir, dolayisiyla java abstract methodlarin private olmasina müsaade etmez
    13) classlar final oldugunda child classa sahip olamazlar. Ama abstract classlar icin child class olmalidir
    cunku child classlar abstract parent taki methodlari kullanirlar. Bu yüzden java abstract classlarin final
    olmasina müsaade etmez
     */
    public  abstract void math();
    //public final abstract void science();

    public void art(){
        System.out.println("Lear art");
    }

   // private abstract void sum();


}
