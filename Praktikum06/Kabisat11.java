import java.util.Scanner;

public class Kabisat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;

        System.out.print("Masukan tahun berapa : ");
        tahun = sc.nextInt();

        if (tahun %4 == 0 && tahun %100 != 0 || (tahun %400 == 0)){
            System.out.println("Tahun kabisat !");
        }
        else {
            System.out.println("Bukan tahun kabisat !");
        }
    }
}
