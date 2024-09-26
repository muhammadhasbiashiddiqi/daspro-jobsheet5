import java.util.Scanner;

/**
 * modifikasikafe18
 */
public class modifikasikafe18 {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String menu;
    char ukuranCup;
    int jumlah;
    boolean keanggotaan;
    System.out.print("masukkan menu : ");
    menu = sc.nextLine();
    System.out.print("masukkan ukuran cup : ");
    ukuranCup = sc.next().charAt(0);
    System.out.print("masukkan jumlah : ");
    jumlah = sc.nextInt();
    System.out.println("masukkan keanggotaan (true/false): ");
    keanggotaan = sc.nextBoolean();

    double hargamenu = 0;
    switch (menu.toLowerCase()) {
        case "kopi":
             hargamenu = 12000;
            break;
        case"teh":
             hargamenu = 7000;
             break;
        case"coklat":
             hargamenu = 20000;
             break;
    }
    double totalharga = hargamenu*jumlah;
    switch (ukuranCup) {
        case 'S':
            break;
        case'M':
            totalharga += 0.25*totalharga;
            break;
        case 'L':
            totalharga += 0.4*totalharga;
            break;
            default:
            System.out.println("size tidak tersedia");
            break;
    }
    double diskon = keanggotaan ? 0 : 0.1;
    double nominalbayar = totalharga - (diskon*totalharga);
    System.out.println("item pembelian " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
    System.out.println("nominal bayar :" + nominalbayar);
    }
} 
