package jobsheet5;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("---Sistem Perpustakaan Kampus :");
        System.out.println("Apakah membawa kartu mahasiswa? (Bawa/Tidak) :" );
        String bawaKartu = sc.nextLine().trim();

        System.out.println("Apakah sudah melakukan registrasi online? (Sudah/Belum):");
        String sudahRegis = sc.nextLine().trim();

        if (bawaKartu.equalsIgnoreCase("Bawa") || sudahRegis.equalsIgnoreCase("Sudah")) {
            System.out.println("Izin masuk diberikan.");
        } else {
            System.out.println("Ditolak masuk, tidak memenuhi syarat.");
        }

       
    }
    
}
