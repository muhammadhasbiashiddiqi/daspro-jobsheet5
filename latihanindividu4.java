import java.util.Scanner;

/**
 * latihanindividu4
 */
public class latihanindividu4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int usia = -1;
            System.out.println("masukkan usia : ");
                usia = sc.nextInt();
                if (usia >= 0) { } 
                else if (usia< 0) {
                    System.out.println("tidak boleh negatif"); }
            else {
                System.out.println("Input tidak valid."); }
        String kategori;
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak - anak ";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "tua";}
        System.out.println("termasuk kedalam kategori: " + kategori);
    }
}
