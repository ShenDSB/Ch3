import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        double Celsius, Fahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        Celsius = in.nextLine ();
        Fahrenheit = (Celsius * 9 / 5) + 32;
        System.out.print(Celsius + " C = " + Fahrenheit + " F");
        
    }
}
