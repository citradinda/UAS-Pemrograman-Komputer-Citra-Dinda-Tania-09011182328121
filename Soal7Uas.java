package soal7uas;
public class Soal7Uas {
    public static void main(String[] args) {
        private String judul;
        private String penulis;
        private int tahunTerbit;
        private boolean sedangDipinjam;
        
        public Soal7Uas(String judul, String penulis, int tahunTerbit) {
            this.judul = judul;
            this.penulis = penulis;
            this.tahunTerbit = tahunTerbit;
            this.sedangDipinjam = false;
        }
        
        public void tampilkanInformasi() {
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Tahun Terbit: " + tahunTerbit);
            System.out.println("Status Peminjaman: " + (sedangDipinjam ? "Sedang Dipinjam" : "Tersedia"));
        }
        
        public void pinjamBuku() {
            if (!sedangDipinjam) {
                sedangDipinjam = true;
                System.out.println("Buku " + judul + " berhasil dipinjam.");
            }
        }
        
        public void kembalikanBuku() {
            if (sedangDipinjam) {
                sedangDipinjam = false;
                System.out.println("Buku " + judul + " berhasil dikembalikan.");
            }
        }
        
        public static void Buku(String[] args) {
            Soal7Uas buku1 = new Soal7Uas("Harry Potter", "J.K. Rowling", 2001);
            Soal7Uas buku2 = new Soal7Uas("Lord of the Rings", "J.R.R. Tolkien", 1954);
            
            
            buku1.tampilkanInformasi();
            buku2.tampilkanInformasi();
            
            buku1.pinjamBuku();
            buku2.pinjamBuku();
            
           buku1.tampilkanInformasi();
           buku2.tampilkanInformasi();
           
           buku1.kembalikanBuku();
           buku2.kembalikanBuku();
           
           buku1.tampilkanInformasi();
           buku2.tampilkanInformasi();
            
        }
        
    
}
