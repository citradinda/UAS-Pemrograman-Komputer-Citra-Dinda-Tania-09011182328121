package soal4uas;
import java.util.Scanner;
public class Soal4Uas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        
        if (bilangan <= 0) {
            System.out.println("Bilangan harus positif. ");
            return;
        }
        
        System.out.println("Faktorisasi " + bilangan + ":");
        
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.print(i + " ");
                bilangan /= i;
            }
        }
    }
    
}
