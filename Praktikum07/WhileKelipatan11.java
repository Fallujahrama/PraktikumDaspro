import java.util.Scanner;

public class WhileKelipatan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, total, counter, i;
        double rata;

        total = 0;
        counter = 0;
        i = 0;

        System.out.print("Masukan bilangan 1-9 : ");
        bilangan = sc.nextInt();

        while (i < 50){
            if (i % bilangan == 0){
                total += i;
                ++counter;
            }
            i++;
        }
        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d\n", counter, bilangan, total);
        rata = (double) total / counter ;
        System.out.println("Rata-rata nya adalah : " + rata);
    }
}
