import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik,numberOfLesson=0,sumOfGrades=0;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        if(mat>=0&&mat<=100){
            numberOfLesson++;
            sumOfGrades+=mat;
        }
        else{
            System.out.println("Matematik notu 0 ile 100 arasında olmalıdır.");
        }
        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if(fizik>=0&&fizik<=100){
            numberOfLesson++;
            sumOfGrades+=fizik;
        }
        else{
            System.out.println("Fizik notu 0 ile 100 arasında olmalıdır.");
        }
        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        if(turkce>=0&&turkce<=100){
            numberOfLesson++;
            sumOfGrades+=turkce;
        }
        else{
            System.out.println("Türkçe notu 0 ile 100 arasında olmalıdır.");
        }
        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if(kimya>=0&&kimya<=100){
            numberOfLesson++;
            sumOfGrades+=kimya;
        }
        else{
            System.out.println("Kimya notu 0 ile 100 arasında olmalıdır.");
        }
        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        if(muzik>=0&&muzik<=100){
            numberOfLesson++;
            sumOfGrades+=muzik;
        }
        else{
            System.out.println("Müzik notu 0 ile 100 arasında olmalıdır.");
        }
        if(numberOfLesson>0){
            average = Double.valueOf(sumOfGrades/ numberOfLesson);
            if (average <= 55) {
                System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere");

            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz");

            }
            System.out.println("Ortalamanız: " + average);
        }
        else{
            System.out.println("Girilen notlar 0 ile 100 arasında olmadığından ortalama hesaplanamadı.");
        }

    }
}
