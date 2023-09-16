package day23exceptions;


public class ExceptionRunner {
/*
Exception'lar dışında Error diye adlandırdığımız ve Handle edilemeyen bazı problemler vardır
mesela application'larda Memory nin dolması bir errordur
        iki tür memory error vardır:
        a) Stack memory dolarsa "StackOverFlow Error" alırsınız
        b) Heap Memory dolarsa "OutOfMemory Error" alirsiniz

        finalize:
        Garbage collector memory'i temiz tutmak için süreklü memory'i tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden önce sileceği dataları "finalize" yapar sonra siler
        yani Garbage collector sadece finalized yapilmis objeleri toplar ve yok eder

        final - finally - finalize()
 */
    public static void main(String[] args) {
//        getStudentGrade(77);
//        getStudentGrade(-77);
//        getStudentGrade(777);
//        System.out.println("main method");

        getTheNumberOfStudents(15);
        getTheNumberOfStudents(-15);



    }
    public static void getTheNumberOfStudents(int numOfStudents){
        if(numOfStudents<0){
            throw new InvalidNumberException("Student number cannot be negative");
        }else{
            System.out.println(numOfStudents);
        }

    }



    public static void getStudentGrade(int grade) {
        if(grade<0 || grade > 100){
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(grade);
        }

    }

}