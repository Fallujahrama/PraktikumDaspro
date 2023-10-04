import java.util.Scanner;

public class PemilihanBilangan11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukan sebuah angka : ");
        angka = input.nextInt();

        if (angka % 2 == 0 ) {
            System.out.println(String.format("Angka %s yang anda masukan angka Genap!", angka));
        }
        else {
            System.out.println(String.format("Angka %s yang anda masukan angka Ganjil!", angka));
        }

        input.close();
    }
}
