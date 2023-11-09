import java.util.Scanner;

public class bioskopScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] penonton = new String[4][2];

        int baris, kolom, menu;
        String nama, next;


        do {
        System.out.println("-Menu 1 : Input data penonton");
        System.out.println("-Menu 2 : Tampilkan daftar penonton");
        System.out.println("-Menu 3 : Exit");
        System.out.print("Pilih menu: ");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                while (true){
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukan kolom: ");
                    kolom = sc.nextInt();
        
                    sc.nextLine();

                    if (penonton[baris-1][kolom-1] == null){
                        penonton[baris-1][kolom-1] = nama;
                    }
                    else {
                        System.out.println("Kursi sudah terisi oleh penonton lainnya");
                        System.out.println("Silahkan pilih kursi lagi");
                        continue;
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
        
                    if (next.equalsIgnoreCase("n")){
                        break;
                    }
                }                
                break;

            case 2:
                System.out.println("Daftar Penonton : ");
                int i, j;
                for (i = 0; i < penonton.length; i++) {
                    for (j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                }
                break;

            case 3:
                break;
        }

        } while (menu != 3);
        sc.close();
    }
}
