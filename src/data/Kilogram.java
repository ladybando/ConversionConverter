package data;

public class Kilogram extends Converter {
    public Kilogram(double input, double k) {
        super(input);
        this.k = k;
    }
    public Kilogram(){}

    @Override
    public String toString() {
        return "Kilogram {" +
                "= " + calc() +
                '}';
    }

    double k;

    public double calc(){
        this.k = (super.calc() / 2.20462);
        return this.k;
    }
}
