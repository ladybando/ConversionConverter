package data;

public class Euro extends Converter{
    public Euro(double input, double e) {
        super(input);
        this.e = e;
    }

    public Euro() {}

    @Override
    public String toString() {
        return "Euro {" +
                "= " + calc() +
                '}';
    }

    double e;

    public double calc(){
        this.e = (super.calc() * 1.20);
        return this.e;
    }
}
