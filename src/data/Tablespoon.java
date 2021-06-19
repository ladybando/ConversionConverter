package data;

public class Tablespoon extends Converter{
    public Tablespoon(double input, double t) {
        super(input);
        this.t = t;
    }

    public Tablespoon(){}

    @Override
    public String toString() {
        return "Tablespoon {" +
                "=" + calc() +
                '}';
    }

    double t;

    public double calc(){
        this.t = (super.calc() * 0.0625);
        return this.t;
    }
}
