public class ContohVariabel11 {

    public static void main(String[]args ){
        String hobiSaya = "Bermain video game";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 19;
        double ipk = 3.85, tinggi = 168;

        System.out.println("Hobi saya adalah : " + hobiSaya);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("IPK : " + ipk);
        // %s untuk memanggil tipe data string yg sudah di declare
        System.out.println(String.format("Saya berumur %s tahun dengan tinggi badan %s", umurSaya, tinggi ));
    }
}