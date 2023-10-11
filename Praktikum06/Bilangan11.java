import java.util.Scanner;

public class Bilangan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;
        int bilMax, bilMin, bilMiddle;
        System.out.print("Masukan angka pertama : ");
        bil1 = sc.nextInt();
        System.out.print("Masukan angka kedua : ");
        bil2 = sc.nextInt();
        System.out.print("Masukan angka ketiga : ");
        bil3 = sc.nextInt();

        if (bil2 > bil1){
            if (bil2 > bil3){
                bilMax = bil2;
                if (bil3 > bil1) {
                    bilMiddle = bil3;
                    bilMin = bil1;
                } else {
                    bilMiddle = bil1;
                    bilMin = bil3;
                }
            } 
            else{
                bilMax = bil3;
                if (bil2 > bil1){
                    bilMiddle = bil2;
                    bilMin = bil1;
                } else {
                    bilMiddle = bil1;
                    bilMin = bil2;
                }
            }
        } 
        else {
            if (bil1 > bil3) {
                bilMax = bil1;
                if (bil2 > bil3) {
                    bilMiddle = bil2;
                    bilMin = bil3;
                } else {
                    bilMiddle = bil3;
                    bilMin = bil2;
                }
            } else{
                bilMax = bil3;
                if (bil1 > bil2){
                    bilMiddle = bil1;
                    bilMin = bil2;
                } else {
                    bilMiddle = bil2;
                    bilMin = bil1;
                }
            }
        }
        System.out.println("Max : " + bilMax);
        System.out.println("Middle : " + bilMiddle);
        System.out.println("Min : " + bilMin);

    }
    
}
