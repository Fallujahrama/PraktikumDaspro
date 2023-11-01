import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int j = 0; j < 10; j++){
            System.out.print("Masukan Nilai akhir mahasiswa ke-" +(j+1)+ " : ");
            nilaiAkhir[j] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Nilai akhir mahasiswa ke-" +(i+1)+ " adalah " + nilaiAkhir[i]);
        }

        sc.close();
    }
}
