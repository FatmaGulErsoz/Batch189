package day16staticoop;

public class InstanceBlock {
    //Eğer tum constructorların içinde öalışması gereken kodlar varsa tekrardan kurtulmak için bu kodları
    //instance block içine yazarız

    public int year;

    public InstanceBlock(){
        System.out.println("hi");
    }

    public InstanceBlock(int year) {
        System.out.println("hi");
        this.year = year;

    }

    {

        System.out.println("hi");

    }






















}
