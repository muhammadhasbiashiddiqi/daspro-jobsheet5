import java.util.Scanner;

/**
 * PemilihanHariDenganIf
 */
public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayType = "";
        System.out.print("Input day number: ");
        int dayName = sc.nextInt();

        if (dayName > 0 && dayName <= 5) {
            dayType = "weekday";
        } else if (dayName > 5 && dayName <= 7) {
            dayType = "weekend";
        } else {
            System.out.println("Invalid number");
            return; // Stop execution if the input is invalid
        }

        // Only print if the input is valid
        System.out.println(dayName + " is a " + dayType);
    }
         
    }
