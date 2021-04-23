import java.util.Scanner;
import java.util.HashMap;

public class Main {
    HashMap<String, String> cmmd = new HashMap<>();

    public static void main(String[] args) {
        Main conversion = new Main();
        conversion.convertTypes();
    }

    Scanner in = new Scanner(System.in);

    public String convertTypes() {
        while (true) {
            cmmd.put("Fahrenheit", "F2C");
            cmmd.put("Pound", "P2K");
            cmmd.put("Kilogram", "K2P");
            cmmd.put("Cup", "C2T");
            cmmd.put("Dollar", "D2E");
            cmmd.put("Euro", "E2D");
            System.out.print("Enter Conversion Command or \"Q\" to Quit:  \n");
            System.out.println(cmmd);

            String cmd = in.next();
            switch (cmd.toUpperCase()) {
                case "F2C": {        // string match
                    System.out.println("Enter Fahrenheit degree: ");
                    System.out.println(convertFahrenheit());
                    break;
                }
                case "C2F": {
                    System.out.println("Enter Celsius degree: ");
                    System.out.println(convertCelsius());
                    break;
                }
                case "P2K": {
                    System.out.println("Enter pound amount: ");
                    System.out.println(convertPounds());
                    break;
                }
                case "K2P": {
                    System.out.println("Enter kilogram amount : ");
                    System.out.println(convertKilograms());
                    break;
                }
                case "T2C": {
                    System.out.println("Enter tablespoon amount: ");
                    System.out.println(convertTablespoons());
                    break;
                }
                case "C2T": {
                    System.out.println("Enter cup amount: ");
                    System.out.println(convertCups());
                    break;
                }
                case "D2E": {
                    System.out.println("Enter dollar amount: ");
                    System.out.println(convertDollars());
                    break;
                }
                case "E2D": {
                    System.out.println("Enter Euro amount: ");
                    System.out.println(convertEuros());
                    break;
                }
                case "Q": {
                    System.out.println("Come again!");
                    System.exit(0);
                }
                default:
                    System.out.println("Unexpected value. Please try again: " + cmd );
            }
        }
    }

    public double convertFahrenheit() {
        double f = in.nextDouble();
        return ((f - 32) * 5.) / 9.;
    }

    public double convertCelsius() {
        double c = in.nextDouble();
        return (c * 9 / 5) + 32;
    }
    public double convertPounds() {
        double p = in.nextDouble();
        return ((p / 2.2046) * .1);
    }
    public double convertKilograms() {
        double k = in.nextDouble();
        return (k * 2.20462);
    }
    public double convertTablespoons() {
        double t = in.nextDouble();
        return (t * 0.0625);
    }
    public double convertCups() {
        double c = in.nextDouble();
        return (c * 16);
    }
    public double convertDollars() {
        double d = in.nextDouble();
        return (d * 0.83);
    }
    public double convertEuros() {
        double e = in.nextDouble();
        return (e * 1.20);
    }
}
