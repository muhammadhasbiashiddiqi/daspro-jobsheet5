import java.util.Scanner;

/**
 * modifikasipemilihanbilangan
 */
public class modifikasipemilihanbilangan {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("masukkan angka :");
        int angka = sc.nextInt();
        String hasil = (angka % 2 == 0)? "angka "+ angka + " termasuk bilangan genap":"angka " + angka + " termasuk bilangan ganjil";
        System.out.println(hasil);

    }
}