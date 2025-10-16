import java.util.Scanner;
public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("=== Input Data Mahasiswa ===");

        System.out.print("Nama :");
        String Nama = sc.nextLine();

        System.out.print("NIM :");
        String NIM = sc.nextLine();

        System.out.println("--- Matkul 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS :");
        double nilaiUTS1 = sc.nextDouble();

        System.out.print("Nilai UAS :");
        double nilaiUAS1 = sc.nextDouble();

        System.out.print("Nilai Tugas :");
        double nilaiTugas1 = sc.nextDouble ();

        System.out.println("--- Matkul 2: Struktur Data ---");

        System.out.print("Nilai UTS :");
        double nilaiUTS2 = sc.nextDouble();

        System.out.print("Nilai UAS :");
        double nilaiUAS2 = sc.nextDouble();

        System.out.print("Nilai Tugas :");
        double nilaiTugas2 = sc.nextDouble ();


        
    }

}
