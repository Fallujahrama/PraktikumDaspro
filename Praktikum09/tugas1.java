public class tugas1 {
    public static void main(String[] args) {
        int a [] = {1, 5, 8, 4, 3};
        int b [] = new int [5];

        for (int j = 0 ; j < b.length ; j++){
            b[j] = a[j];
        }
        for (int h : b){
            System.out.println("Variable b = ");
            System.out.println(h);        
        }
        for (int k : a){
            System.out.println("Variable a = ");
            System.out.println(k);
        }
    }
}