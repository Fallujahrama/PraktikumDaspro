import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];
        int total = 0, tertinggi = 0, terendah = 1000, jumlahLulus = 0, jumlahTidak = 0;
        double rataRata;

        for (int j = 0; j < nilaiAkhir.length; j++){
            System.out.print("Masukan Nilai akhir mahasiswa ke-" +(j+1)+ " : ");
            nilaiAkhir[j] = sc.nextInt();

            if (nilaiAkhir[j] > tertinggi){
                tertinggi = nilaiAkhir[j];
            }
            else if (nilaiAkhir[j] < terendah){
                terendah = nilaiAkhir[j];
            }
            total += nilaiAkhir[j];
        }

        for (int i = 0; i < nilaiAkhir.length; i++){
            if (nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke- " +(i+1)+ " lulus");
                jumlahLulus++;
            } else {
                System.out.println("Mahasiswa ke- " +(i+1)+ " tidak lulus");
                jumlahTidak += 1;
            }
        }

        rataRata = (double) total/nilaiAkhir.length;
        System.out.println("Rata-rata nilai adalah : " +rataRata);
        System.out.println("Nilai tertinggi adalah : " +tertinggi);
        System.out.println("Nilai terendah adalah : " +terendah);
        System.out.println("Jumlah mahasiswa lulus : " +jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " +jumlahTidak);



        sc.close();
    }
}
