import java.util.Scanner;

public class segitigaAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah n segitiga (>2) : ");
        int n = sc.nextInt();


        if (n > 2){
            for (int j = 1; j <= n; j++){
                for (int g = 0; g < n-j; ++g){
                    System.out.print(" ");
                }
                for (int b = 1; b <= j; ++b) {
                    System.out.print(b);
                }
                System.out.println();
            }
        } else{
            System.out.println("Angka yang dimasukan tidak lebih dari 2!");
        }
        
        sc.close();
    }
}
