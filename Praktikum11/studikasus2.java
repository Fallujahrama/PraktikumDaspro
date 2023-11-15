public class studikasus2 {
    public static void main(String[] args) {
        
        System.out.println("=== Looping cetak bintang ===");
        System.out.println("=== Tugas A ===");
        
        for (int i = 10; i >= 0; i--){
            for (int k = 0; k <= i; k++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        
        System.out.println("=== Looping cetak bintang ===");
        System.out.print("=== Tugas B ===");

        for (int j = 0; j <= 10; j++){
            for (int g = 0; g < 10-j; g++){
                System.out.print(" ");
            }
            for (int b = 0; b < j; b++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}