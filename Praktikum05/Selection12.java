import java.util.Scanner;

public class Selection12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;

        System.out.print("Berapa Nilai mu? : ");
        nilai = input.nextInt();

        if (nilai >=90){
            nilai +=10;
        }
        else {
            nilai -=10;
        }

        System.out.println("Nilai akhir mu sebesar : " + nilai);

    }
    
}
