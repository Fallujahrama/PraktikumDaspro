import java.util.Scanner;

public class LinearSearch11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int key = 0, hasil = -5, elemen;

        System.out.print("Masukan jumlah elemen array : ");
        elemen = sc.nextInt();
        int [] arrayInt = new int[elemen];

        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukan elemen array ke-" +(i+1)+ " : ");
            arrayInt[i] = sc.nextInt();

        }

        System.out.print("Masukan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int j = 0; j < arrayInt.length; j++){
            if (arrayInt[j] == key){
                hasil = j;
                break;
            }
        }

        if (hasil == -5){
            System.out.println("Key tidak ditemukan!");
        } 
        else{
            System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
        }
        
        sc.close();
    }
}
