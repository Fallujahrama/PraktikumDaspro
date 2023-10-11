import java.util.Scanner;

public class Segitiga11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukan nilai sudut 1 : ");
        sudut1 = sc.nextInt();
        System.out.print("Masukan nilai sudut 2 : ");
        sudut2 = sc.nextInt();
        System.out.print("Masukan nilai sudut 3 : ");
        sudut3 = sc.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180){
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Itu merupakan segitiga siku-siku");
            }
            else {
                System.out.println("Itu bukan segitiga siku-siku");
            }
        }
    }   
}
