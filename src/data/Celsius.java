package data;

public class Celsius extends Converter{
    @Override
    public String toString() {
        return "Celsius {" +
                "= " + calc() +
                '}';
    }

    double c = 0.0;
    public Celsius(double input) {
        super(input);
    }

    public Celsius() {  }

    public double calc(){
        this.c = ((super.calc() - 32) * 5 / 9);
        return this.c;
    }
}
