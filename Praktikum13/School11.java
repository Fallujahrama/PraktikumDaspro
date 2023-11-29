public class School11 {
    public static void main(String[] args) {
        String [] student1A = { "Anne", "Aldrian", "Ali", "Arul", "Ashley" };
        String [] student1B = { "Bobby", "Brian", "Bill" };
        String [] student1C = { "Clara", "Celine", "Charlie", "Caroline" };
        String [] student1D = { "Daniel", "Daisy", "Diana" };

        System.out.printf("=========================%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("=========================%n");
        
        for (int i = 0; i < student1A.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i + 1), student1A[i]);
        }

        System.out.printf("=========================%n%n");

        System.out.printf("=========================%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("=========================%n");
        
        for (int i = 0; i < student1B.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i + 1), student1B[i]);
        }

        System.out.printf("=========================%n%n");
        
        System.out.printf("=========================%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("=========================%n");
        
        for (int i = 0; i < student1C.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i + 1), student1C[i]);
        }

        System.out.printf("=========================%n%n");
        
        System.out.printf("=========================%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("=========================%n");
        
        for (int i = 0; i < student1D.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i + 1), student1D[i]);
        }

        System.out.printf("=========================%n%n");
        
    }
    
}
