import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int j = 0; j < nilaiAkhir.length; j++){
            System.out.print("Masukan Nilai akhir mahasiswa ke-" +(j+1)+ " : ");
            nilaiAkhir[j] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            if (nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke- " +(i+1)+ " lulus");
            } else {
                System.out.println("Mahasiswa ke- " +(i+1)+ " tidak lulus");
            }
        }
        sc.close();
    }
}
