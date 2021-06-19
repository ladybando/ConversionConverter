package data;

public class Fahrenheit extends Converter{
    public Fahrenheit(double input, double f) {
        super(input);
        this.f = f;
    }

    @Override
    public String toString() {
        return "Fahrenheit {" +
                calc() +
                '}';
    }

    private double f;

    public Fahrenheit() { }

    public double calc(){
        this.f = ((super.calc() - 32) * 5. / 9.);
        return this.f;
    }
}
