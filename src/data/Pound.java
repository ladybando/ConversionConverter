package data;

public class Pound extends Converter{
    public Pound(double input, double p) {
        super(input);
        this.p = p;
    }

    public Pound() {  }

    @Override
    public String toString() {
        return "Pound {" +
                "= " + calc() +
                '}';
    }
    double p;

    public double calc(){
        this.p = (super.calc() * 2.20462);
        return this.p;
    }

}
