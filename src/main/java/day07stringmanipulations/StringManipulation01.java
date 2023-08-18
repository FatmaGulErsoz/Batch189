package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {
       /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordünüzü giriniz...");
        String pwd = input.nextLine();

        // i)En az 8 character olsun
        boolean lengthControl = pwd.length()>7;
        System.out.println("lengthControl =" + lengthControl);

        // ii) Space charecteri password'de olmasin
        boolean sapaceControl = pwd.contains("");
        System.out.println("sapaceControl = " + sapaceControl);

        // iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl=pwd.replaceAll("[^A-Z]" , "").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);
        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl= pwd.replaceAll("[^a-z]","").length() >0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun
        boolean numberControl = pwd.replaceAll("[^0-9]","" ).length()>0;
        System.out.println("numberControl = " + numberControl);


        boolean result = lengthControl && sapaceControl && upperCaseControl && lowerCaseControl &&  numberControl;

        if(result){
            System.out.println("Passwordu gecerli");
        }else{
            System.out.println("Passwordu gecersiz");
        }







    }

}


