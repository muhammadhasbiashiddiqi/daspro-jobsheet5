import java.util.Scanner;
/**
 * SIAKAD18
 */
public class SIAKAD18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kualifikasi, huruf;
        char kelas;
        byte absen;
        int nilaiakhir;
        double nilaikuis, nilaitugas, nilaiujian;
        System.out.println("masukkan nama :");
        nama = sc.nextLine();
        System.out.println("masukkan NIM :");
        nim = sc.nextLine();
        System.out.println("masukkkan kelas :");
        kelas = sc.nextLine().charAt(0);
        System.out.println("masukkan absen :");
        absen = sc.nextByte();
        System.out.println("masukkan nilai tugas :");
        nilaitugas = sc.nextDouble();
        System.out.println("masukkan nilai kuis :");
        nilaikuis = sc.nextDouble();
        System.out.println("masukkan nilai ujian :");
        nilaiujian = sc.nextDouble();
        double n = (nilaiujian+nilaikuis+nilaitugas)/3;
        if (n <= 100 && n > 80) {
            huruf = "A";
            kualifikasi = "sangat baik";
        }
        else if (n <= 80 && n > 73) {
            huruf = "B+";
            kualifikasi = "lebih dari baik";
        }
        else if (n <= 73 && n > 65) {
            huruf = "B";
            kualifikasi = "Baik";
        }
        else if (n <= 65 && n > 60) {
            huruf = "C+";
            kualifikasi = "lebih dari cukup";
        }
        else if (n <= 60 && n > 50) {
            huruf = "C";
            kualifikasi = "cukup";
        }
        else if (n <= 50 && n > 39) {
            huruf = "D";
            kualifikasi = "kurang";
        }
        else {
            huruf = "E";
            kualifikasi = "GAGAL";
    }
    System.out.println(" mahasiswa dengan nama  " + nama + "( NIM " + nim + " )" + " kelas " + kelas + " nomor absen " + absen);
        System.out.println("nilai akhir : " + n);
        System.out.println("huruf : " + huruf);
        System.out.println("kualifikasi : " + kualifikasi);
}
}