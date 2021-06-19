package data;

public class Cup extends Converter{
    public Cup(double input, double cup) {
        super(input);
        this.cup = cup;
    }

    public Cup(){}

    @Override
    public String toString() {
        return "Cup {" +
                "= " + calc() +
                '}';
    }

    double cup;

    public double calc(){
        this.cup = (super.calc() * 16);
        return this.cup;
    }

}
