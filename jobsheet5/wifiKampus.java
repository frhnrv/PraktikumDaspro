package jobsheet5;
import java.util.Scanner;

public class wifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String pesan;

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lain): ");
        String jenisPengguna = sc.nextLine().trim();

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (Dosen).");
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil: ");
            int SKS = sc.nextInt();
            
            if (SKS >= 12) {
                System.out.println("Akses WiFi diberikan (Mahasiswa Aktif).");
            } else {
                System.out.println("Akses ditolal, SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses ditolak. ");
        }
    }
}
