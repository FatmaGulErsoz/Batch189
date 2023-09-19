package day26lambda;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        //System.out.println(courseList);
        //[Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Night', avarageScore=98, numberOfStudents=154},
        // Course{season='Spring', courseName='English Day', avarageScore=95, numberOfStudents=132},
        // Course{season='Winter', courseName='English Night', avarageScore=93, numberOfStudents=144}]

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz

        boolean result1 = courseList.stream().allMatch(t-> t.getAvarageScore()>91);//true

        System.out.println(result1);

        //AllMatch methodu parantez içinde verilen sarta göre Stream içerisindeki bütün
        // elemanların bu şarta uyması durumunda true return eder


        //2)Tum kurslardaki ögrenci sayilarinin 100 den buyuk olup olmadigini kontrol kodu yaziniz

        boolean result2 = courseList.stream().allMatch(t-> t.getNumberOfStudents()>100);//true

        System.out.println(result2);

        //3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        boolean result3 = courseList.stream().anyMatch(t-> t.getCourseName().contains("Turkish"));//true

        System.out.println(result3);

        //anyMatch methodu method parantezi içinde verilen sarta göre Stream içerisindeki herhangi bir
        //elemanın bu şarta uyması durumunda true return eder..

        //4) sezon isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        boolean result4 = courseList.stream().anyMatch(t -> t.getSeason().contains("Summer"));//true

        System.out.println(result4);

        //noneMatch methodu method parantezi icinde verilen sarta gore Stream icerisindeki
        // hicbir elemanin bu sarti saglamamasi durumunda true return eder

        //5) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.

        boolean result5= courseList.stream().noneMatch(t-> t.getSeason().contains("Fall"));//true

        System.out.println(result5);

        //6) Kurs isimleri icinde "German" isminin hic bulunmadigini kontrol eden kodu yaziniz.

        boolean result99 = courseList.stream().noneMatch(t-> t.getCourseName().contains("German"));//true

        System.out.println(result99);


    }
}
