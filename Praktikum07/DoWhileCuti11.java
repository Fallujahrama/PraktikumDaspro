import java.util.Scanner;

public class DoWhileCuti11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner (System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = input11.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil Cuti (y/t)? ");
            konfirmasi = input11.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input11.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            } else{
                break;
            }
        }
            while (jatahCuti > 0);
    }
    
}
