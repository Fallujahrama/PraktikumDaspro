import java.util.Scanner;

public class tugas14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] bulat = new int[8];
        int total = 0;
        double rata;

        for (int j = 0 ; j < bulat.length; j++){
            System.out.print("Masukan bilangan ke " +(j+1)+" : ");
            bulat[j] = sc.nextInt();
        }
        for (int i = 0 ; i < bulat.length; i++){
            total += bulat[i];
        }
        System.out.println("Total keseluruhan = " +total);
        rata = (double) total/bulat.length;
        System.out.println("Rata-rata dari seluruh bilangan = " +rata);

        sc.close();
    }
    
}
