import java.util.Scanner;

public class PemilihanBilangan11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukan sebuah angka : ");
        angka = input.nextInt();

        String hasil = (angka % 2 == 0) ? "Angka Genap" : "Angka Ganjil";
        System.out.println(hasil);

        input.close();
    }
}
