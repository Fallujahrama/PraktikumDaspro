import java.util.Scanner;

public class NestedLoop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah kota : ");
        int n = sc.nextInt();

        double [][] suhu = new double[n][4];
        double rata, counter=0;

        int i,j;

        for (i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-"+ (i+1) + ": ");
            
            for (j = 0; j < suhu[i].length; j++) {
                System.out.print("Suhu ke-" + (j+1) + ": ");
                suhu[i][j] = sc.nextDouble();                
            }

            
            System.out.println();
        }
        
        for (int k = 0; k < suhu.length; k++) {
            System.out.print("KOTA KE-"+ (k+1) + ": ");
            
            // for (int j = 0; j < suhu[i].length; j++) {
                //     System.out.print(suhu[i][j] + " ");
                // }
                
            for (double ampunsuhu : suhu[k]) {
                System.out.print(ampunsuhu + "  ");
                counter += ampunsuhu;
            }

            rata = (double) counter / 4;

            System.out.println();
            System.out.println("Rata-rata tiap kota : " + rata);
            counter = 0;
        }

        sc.close();
    }
}
