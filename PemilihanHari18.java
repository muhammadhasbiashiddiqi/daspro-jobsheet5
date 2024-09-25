import java.util.Scanner;

/**
 * PemilihanHari18
 */
public class PemilihanHari18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayTpe ;
        System.out.print("input day name :");
        dayName = sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                 dayTpe ="weekday";
            case "saturday":
            case "sunday":
                 dayTpe = "weekend";
                break;
        
            default:
            dayTpe = "invalid day name";
                break;
        }
        System.out.println(dayName + " is a " + dayTpe );
    }
}