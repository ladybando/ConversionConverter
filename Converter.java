package data;
import java.util.HashMap;
import java.util.Scanner;

public class Converter {
    Scanner in = new Scanner(System.in);
    HashMap<String, String> listOfCommands = new HashMap<>();

    public void convertTypes() {
        while (true) {
            System.out.println("Enter Conversion Command or \"Q\" to Quit: ");
            listOfCommands.put("F2C","Fahrenheit");
            listOfCommands.put("P2K","Pound");
            listOfCommands.put("K2P","Kilogram");
            listOfCommands.put("C2T","Cup");
            listOfCommands.put("D2E","Dollar") ;
            listOfCommands.put("E2D","Euro");
            //prints commands in list format
            listOfCommands.forEach((k, v) -> System.out.println(" Conversion Type => " + k + " \tCode => " + v));
            //takes user input as string
            String cmd = in.next();

            System.out.println("Enter the value you would like converted from the list below: ");
            switch (cmd.toUpperCase()) {
                case "F2C": {
                    getUserInput(listOfCommands.get("F2C") + ": ");
                    System.out.println("Celsius: " + convertFahrenheit() + "\n");
                    break;
                }
                case "C2F": {
                    getUserInput(listOfCommands.get("C2F") + ": ");
                    System.out.println("Fahrenheit: " + convertCelsius() + "\n");
                    break;
                }
                case "P2K": {
                    getUserInput(listOfCommands.get("P2K") + ": ");
                    System.out.println("Kilograms: " + convertPounds() + "\n");
                    break;
                }
                case "K2P": {
                    getUserInput(listOfCommands.get("K2P") + ": ");
                    System.out.println("Pounds: " + convertKilograms() + "\n");
                    break;
                }
                case "T2C": {
                    getUserInput(listOfCommands.get("T2C") + ": ");
                    System.out.println("Cups: " + convertTablespoons() + "\n");
                    break;
                }
                case "C2T": {
                    getUserInput(listOfCommands.get("C2T") + ": ");
                    System.out.println("Tablespoons: " + convertCups() + "\n");
                    break;
                }
                case "D2E": {
                    getUserInput(listOfCommands.get("D2E") + ": $");
                    System.out.println("Euros: €" + convertDollars()+ "\n");
                    break;
                }
                case "E2D": {
                    getUserInput(listOfCommands.get("E2D") + ": €");
                    System.out.println("Dollars: $" + convertEuros() + "\n");
                    break;
                }
                case "Q": {
                    System.out.println(" \"Q\" selected. Conversions complete!");
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
        return ((p / 2.2046) );
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
    public void getUserInput(String type){
        System.out.print(type);
    }
}
