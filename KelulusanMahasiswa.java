import java.util.Scanner;

public class KelulusanMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Masukkan nama :");
        String Nama = input.nextLine();
        System.out.print("masukkan nim :");
        String NIM = input.nextLine();

        System.out.println("=== Mata Kuliah: Algoritma dan Pemrograman ===");
        System.out.print("Masukkan Nilai UTS: ");
        double utsAlgo = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uasAlgo = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugasAlgo = input.nextDouble();

        
        double nilaiAkhirAlgo = (0.3 * utsAlgo) + (0.4 * uasAlgo) + (0.3 * tugasAlgo);

        
        System.out.println("\n=== Mata Kuliah: Struktur Data ===");
        System.out.print("Masukkan Nilai UTS: ");
        double utsSD = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uasSD = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugasSD = input.nextDouble();


        double nilaiAkhirSD = (0.3 * utsSD) + (0.4 * uasSD) + (0.3 * tugasSD);

        
        String statusAlgo, statusSD;

        if (nilaiAkhirAlgo >= 60) {
            statusAlgo = "LULUS";
        } else {
            statusAlgo = "TIDAK LULUS";
        }

        if (nilaiAkhirSD >= 60) {
            statusSD = "LULUS";
        } else {
            statusSD = "TIDAK LULUS";
        }

        String gradeAlgo, gradeSD;

        if (nilaiAkhirAlgo >= 85) gradeAlgo = "A";
        else if (nilaiAkhirAlgo >= 73) gradeAlgo = "B+";
        else if (nilaiAkhirAlgo >= 65) gradeAlgo = "B";
        else if (nilaiAkhirAlgo >= 60) gradeAlgo = "C+";
        else if (nilaiAkhirAlgo >= 50) gradeAlgo = "C";
        else if (nilaiAkhirAlgo > 39) gradeAlgo = "D";
        else gradeAlgo = "E";

        if (nilaiAkhirSD >= 80) gradeSD = "A";
        else if (nilaiAkhirSD >= 73) gradeSD = "B+";
        else if (nilaiAkhirSD >= 65) gradeSD = "B";
        else if (nilaiAkhirSD >= 60) gradeSD = "C+";
        else if (nilaiAkhirSD >= 50) gradeSD = "C";
        else if (nilaiAkhirSD > 39) gradeSD = "D";
        else gradeSD = "E";

      
        String statusSemester;
        double rataRata = (nilaiAkhirAlgo + nilaiAkhirSD) / 2;

        if (statusAlgo.equals("LULUS") && statusSD.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }
        System.out.println("\n===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println();
        System.out.println("Mata Kuliah\t                          UTS    UAS    Tugas    Nilai Akhir   Nilai Huruf   Status");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Nilai Akhir Algoritma dan Pemrograman:\t "     + utsAlgo + "    "+uasAlgo+"    "+tugasAlgo+"        "+nilaiAkhirAlgo+"           "+gradeAlgo+"       "+statusAlgo );
        System.out.println("Struktur Data :\t\t\t\t"                           + utsSD +   "    "+uasSD+"    "+tugasSD+"        "+nilaiAkhirSD+"           "+gradeSD+"       "+statusSD);            
        System.out.println();                
        System.out.println("Rata-rata Nilai Akhir: " + rataRata);
        System.out.println("Status Semester: " + statusSemester);

        input.close();
    }
}

