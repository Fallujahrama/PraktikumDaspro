import java.util.Scanner;

public class cobademo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userPustakawan [] = {"admin1", "admin2", "admin3"};
        String passPustakawan [] = {"admin2", "admin3", "admin1"};
        String userMahasiswa [] = {"Deva", "Dini", "Fallujah", "Khoir"};
        int passMahasiswa [] = {107, 108, 109, 110};

        String loginMasuk;
        int found = -1;

        System.out.println("===========================================================");
        System.out.println("||      Login (Mahasiswa/Pustakawan)        ||");
        System.out.print("||      ");
        loginMasuk = sc.nextLine();

        if (loginMasuk.equalsIgnoreCase("Mahasiswa")){
            System.out.println("===========================================================");
            System.out.print("||      Masukan Nama Anda : ");
            String nama = sc.nextLine();
            System.out.print("||      Masukan NIM Anda  : ");
            int nomor = sc.nextInt();
            
            for (int i = 0; i < userMahasiswa.length; i++) {
                if (userMahasiswa[i].equalsIgnoreCase(nama) && passMahasiswa[i] == nomor) {
                    found = i;
                    System.out.println("||      Selamat Datang di Perpustakaan JTI               ");
                    System.out.printf("||      Silahkan mencari buku %s", userMahasiswa[i]);                    
                }
            }

            if (found == -1){
                System.out.println("||      Nama atau NIM yang anda masukan salah.                    ");
            }
        }
        else if (loginMasuk.equalsIgnoreCase("Pustakawan")){
            System.out.println("===========================================================");
            System.out.print("||      Masukan Username Anda : ");
            String username = sc.nextLine();
            System.out.print("||      Masukan Password Anda : ");
            String password = sc.nextLine();
            
            for (int j = 0; j < userPustakawan.length; j++) {
                if (userPustakawan[j].equalsIgnoreCase(username) && passPustakawan[j].equalsIgnoreCase(password)){
                    found = j;
                    System.out.println("||      Sistem Perpustakaan JTI               ");
                }
            }

            if (found == -1){
                System.out.println("||      Username atau Password yang anda masukan salah.                    ");
            }

        }
        sc.close();
    }
}
