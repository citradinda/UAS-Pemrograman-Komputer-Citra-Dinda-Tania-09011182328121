package soal3uas;
import java.util.Scanner;
public class Soal3Uas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        int a = 0, b = 1, c;
        
        System.out.print("Deret Fibpnacci: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            c = a + b;
            a = b;
            b = c;
        }
    }
    
}
