package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudsh lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = (uktLunas)
            ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tangan DPA"
            : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
            System.out.println(pesan);

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tangan DPA");

        } else {
            System.out.println ("Registrasi ditolak");
            System.out.println("Silahkan lunasi UKT terlebih dahulu");
        }

    }
    
}
