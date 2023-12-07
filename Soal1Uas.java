package soal1uas;
import java.util.Scanner;
public class Soal1Uas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan harga barang: ");
        double harga = input.nextDouble();
        
        System.out.println("Masukkan jumlah pembelian: ");
        int jumlah = input.nextInt();
        
        double total = harga * jumlah;
        double diskon = 0;
        
        if(jumlah <5) {
            
        } else if (jumlah >= 5 && jumlah <= 10) {
            diskon = total * 0.05;
        } else if (jumlah > 10 && jumlah <= 20) {
            diskon = total * 0.01;
        } else{
            diskon = total * 0.2;
        }
        
        total = total - diskon;
        
        System.out.println("Total harga yang harus dibayar: " + total);
    }
    
}
