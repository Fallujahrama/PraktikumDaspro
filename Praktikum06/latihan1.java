import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3, bilTerbesar;

        System.out.print("Masukan angka pertama : ");
        bil1 = sc.nextInt();
        System.out.print("Masukan angka kedua : ");
        bil2 = sc.nextInt();
        System.out.print("Masukan angka ketiga : ");
        bil3 = sc.nextInt();

        bilTerbesar = (bil1 > bil2) ? (bilTerbesar = (bil1 > bil3) ? bil1 : bil3) : (bilTerbesar = (bil2 > bil3) ? bil2 : bil3);

        System.out.println("Bilangan terbesar : " + bilTerbesar);
    }
}
