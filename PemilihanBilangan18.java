import java.util.Scanner;

/**
 * PemilihanBilangan18
 */
public class PemilihanBilangan18 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("masukkan angka :");
        int angka = sc.nextInt();
        if (angka % 2 == 0) {
            System.out.println("angka "+ angka + " termasuk bilangan genap");
        }
        else{
            System.out.println("angka " + angka + " termasuk bilangan ganjil");
        }

    }
}