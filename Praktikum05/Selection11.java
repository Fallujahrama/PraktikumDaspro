import java.util.Scanner;

public class Selection11{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukan sebuah angka : ");
        angka = input.nextInt();

        /* 
        if (angka % 2 == 0) {
            System.out.println("Angka Genap");
        }
        else {
            System.out.println("Angka Ganjil");
        }
        */
        
        String output = (angka % 2 == 0) ? "Angka Genap!" : "Angka Ganjil!";
        System.out.println(output);

    }



}