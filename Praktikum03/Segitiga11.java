import java.util.Scanner;

public class Segitiga11 {
    
    public static void main(String[] args) {
        //deklarasi variable scanner bernama sc, agar bisa membaca input user
        Scanner sc = new Scanner(System.in);

        //deklarasi variable alas, tinggi, luas
        int alas, tinggi;
        float luas;

        System.out.print("Berapa nilai alas : ");
        alas = sc.nextInt();
        System.out.print("Berapa nilai tinggi : ");
        tinggi = sc.nextInt();

        //rumus menghitung luas segitiga
        luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga adalah : " + luas);


    }
}
