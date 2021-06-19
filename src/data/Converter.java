package data;
import java.util.Scanner;

public class Converter {
    public Converter(double input) {
        this.input = input;
    }
    private double input;

    public Converter() {

    }

    public double calc(){
        Scanner in = new Scanner(System.in);
        double input = in.nextDouble();
        return input;
    }
}
