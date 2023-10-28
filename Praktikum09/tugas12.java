import java.util.Scanner;

public class tugas12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Masukan nilai ke-" +(i+1)+ " : ");
            numbers[i] = sc.nextInt();
        }

        for (int i = numbers.length - 1; i >=0 ; i--){
            System.out.println(numbers[i]);
        }
    }
}
