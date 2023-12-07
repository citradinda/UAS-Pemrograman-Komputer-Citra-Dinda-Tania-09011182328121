package soaluas2;
import java.util.Scanner;
public class SoalUas2 {
    public static void main(String[] args) {
        String username = "endy";
        String password = "123";
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan username: ");
        String inputUsername = input.next();
        System.out.print("Masukkan password: ");
        String inputPassword = input.next();
        
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }     
    }
    
}
