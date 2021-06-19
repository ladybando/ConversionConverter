package data;

public class Dollar extends Converter{
    public Dollar(double input, double d) {
        super(input);
        this.d = d;
    }

    @Override
    public String toString() {
        return "Dollar {" +
                "= " + calc()+
                '}';
    }

    double d;

    public Dollar() {  }

    public double calc(){
        this.d = (super.calc() * 0.83);
        return this.d;
    }
}
