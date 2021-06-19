import data.*;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        output();
    }
    HashMap<String, String> listOfCommands = new HashMap<>();

    public static void output() {
        Main cmmd = new Main();
        HashMap<String,String> list = cmmd.cmmdList();
        while (list.size() > 0) {
            list.forEach((k, v) -> System.out.println("  Code: " + v + "  Conversion Type: " + k));
            Scanner in = new Scanner(System.in);
            String cmd = in.next();
            System.out.print("Enter a value or \"Q\" to quit: ");

            switch (cmd.toUpperCase()) {
                case "F2C" -> System.out.println(new Fahrenheit());
                case "C2F" -> System.out.println(new Celsius());
                case "P2K" -> System.out.println(new Pound());
                case "K2P" -> System.out.println(new Kilogram());
                case "T2C" -> System.out.println(new Tablespoon());
                case "C2T" -> System.out.println(new Cup());
                case "D2E" -> System.out.println(new Dollar());
                case "E2D" -> System.out.println(new Euro());
                case "Q" -> {
                    System.out.print("\n\"Q\" selected. Conversion complete. ");
                    System.exit(0);
                }
                default -> System.out.println("Unexpected value. Please try again: " + cmd);
            }
        }
    }

    public HashMap<String, String > cmmdList(){
        //while the method is running out put select a command

        System.out.println("Select a command using the list below:  ");
        //adds these values to the hash list with the first option as a key and the second the value
        listOfCommands.put("Dollar", "D2E");
        listOfCommands.put("Kilogram", "K2P");
        listOfCommands.put("Pound", "P2K");
        listOfCommands.put("Euro", "E2D");
        listOfCommands.put("Fahrenheit", "F2C");
        listOfCommands.put("Cup", "C2T");
        return listOfCommands;
    }
}