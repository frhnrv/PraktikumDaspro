import java.util.Scanner;
public class lulusMatkul {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("=== Input Data Mahasiswa ===");

        System.out.print("Nama :");
        String Nama = sc.nextLine ();

        System.out.println("NIM :");
        String NIM = sc.nextLine ();

        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman --- ");

        System.out.print("Nilai Akhir :");
        int nilaiAkhir = sc.nextInt ();

        String Huruf, Setara, Kualifikasi;

        if (nilaiAkhir >=80 && nilaiAkhir<=100) {
            Huruf="A";
            Setara="4";
            Kualifikasi="Sangat Baik";
        } else if (nilaiAkhir >= 73) {
            Huruf="B+";
            Setara="3.5";
            Kualifikasi="Lebih dari Baik";
        } else if (nilaiAkhir >= 65) {
            Huruf="B";
            Setara="3";
            Kualifikasi="Baik";
        } else if (nilaiAkhir >= 60) {
            Huruf="C+";
            Setara="2.5";
            Kualifikasi="Lebih dari Cukup";
        } else if (nilaiAkhir >= 50) {
            Huruf="C";
            Setara="2";
            Kualifikasi="Cukup";
        } else if (nilaiAkhir > 39) {
            Huruf="D";
            Setara="1";
            Kualifikasi="Kurang";
        } else {
            Huruf="E";
            Setara="0";
            Kualifikasi="Gagal";
        }
        
        System.out.println("Status :");
        System.out.println("Nama :" + Nama);
        System.out.println("Nilai Angka :" + nilaiAkhir);
        if (nilaiAkhir >39 && nilaiAkhir <= 100) {
            System.out.println("Nilai Huruf :" + Huruf);
            System.out.println("Nilai Setara :" + Setara);
            System.out.println("Kualifikasi :" + Kualifikasi);
        } else {
            System.out.println(Huruf);
            System.out.println(Setara);
            System.out.println(Kualifikasi);
        }
         
    }
    
}
