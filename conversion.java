import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter Conversion Command or \"Q\" to Quit:  ");
            Scanner in = new Scanner(System.in);
            String cmd = in.next();

            switch (cmd.toUpperCase()) {
                case "F2C": {        // string match
                    System.out.println("Enter Fahrenheit degree: ");
                    double f = in.nextDouble();
                    double c = (f - 32) * 5. / 9.;
                    System.out.println("Fahrenheit: " + f + "  Celsius: " + c);
                    break;
                }
                case "C2F": {
                    System.out.println("Enter Celsius degree: ");
                    double c = in.nextDouble();
                    double f = (c * 9 / 5) + 32;
                    System.out.println("Celsius: " + c + "  Fahrenheit: " + f);
                    break;
                }
                case "P2K": {
                    System.out.println("Enter pound amount: ");
                    double p = in.nextDouble();
                    double k = ((p/2.2046) * .1);
                    System.out.println("Pounds: " + p + "  Kilograms: " + k);
                    break;
                }
                case "K2P": {
                    System.out.println("Enter kilogram amount : ");
                    double k = in.nextDouble();
                    double p = (k * 2.20462);
                    System.out.println("Kilograms: " + k + "  Pounds: " + p);
                    break;
                }
                case "T2C": {
                    System.out.println("Enter tablespoon amount: ");
                    double t = in.nextDouble();
                    double c = (t * 0.0625);
                    System.out.println("Tablespoons: " + t + "  Cups: " + c);
                    break;
                }
                case "C2T": {
                    System.out.println("Enter cup amount: ");
                    double c = in.nextDouble();
                    double t = (c * 16);
                    System.out.println("Cups: " + t + "  Tablespoons: " + c);
                    break;
                }
                case "D2E": {
                    System.out.println("Enter dollar amount: ");
                    double d = in.nextDouble();
                    double e = (d * 0.83);
                    System.out.println("Dollars: " + d + "  Euros: " + e);
                    break;
                }
                case "E2D": {
                    System.out.println("Enter Euro amount: ");
                    double e = in.nextDouble();
                    double d = (e * 1.20);
                    System.out.println("Euros: " + e + "  Dollars: " + d);
                    break;
                }
                case "Q": {
                    System.out.println("Come again!");
                    System.exit(0);
                 }

                default:
                    throw new IllegalStateException("Unexpected value: " + cmd);
            }
        }
    }
}
