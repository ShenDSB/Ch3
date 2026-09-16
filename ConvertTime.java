import java.util.Scanner;

public class ConvertTime {

    public static void main(String[] args) {
        double second, minute, hour, reminder_sec, reminder_min;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a second and I will convert it into hours and minuts: ");
        second = in.nextDouble ();
        minute = second / 60;
        hour = minute / 60;
        reminder_min = minute % 60;
        reminder_sec = second % 60;
        
        System.out.printf("%.0f seconds = %.0f hours, %.0f minutes, and %.0f seconds", second, hour, reminder_min, reminder_sec);
        
        
    }
}
