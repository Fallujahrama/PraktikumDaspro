import java.util.Scanner;

public class persegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input nilai n (ganjil dan > 2) : ");
        int n = sc.nextInt();

        if (n % 2 == 0 || n <= 2){
            System.out.println("Angka harus ganjil dan lebih dari 2");
        } else{
            if (n <= 9){
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                            System.out.print(n + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
            else if (n >= 10){
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                            System.out.print(n + " ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }

            }
        }


        sc.close();
    }
}
