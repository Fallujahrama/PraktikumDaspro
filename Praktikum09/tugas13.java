import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" };
        int angka;

        do {
            System.out.print("Masukan angka (1-12) : ");
            angka = sc.nextInt();

            if (angka < 1 || angka > 12){
                System.out.println("Inputan salah");
            }
            else {
                System.out.println("Nama bulan : " + bulan[angka-1]);
                break;
            }
        } while (true);
        sc.close();
    }
}
