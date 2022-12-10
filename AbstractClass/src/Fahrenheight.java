public class Fahrenheight extends Celcius{
    private double fahrenheight;
    private double celcius;

    public Fahrenheight(double celcius){
        this.celcius = celcius;
    }
    @Override
    double suhu() {
        fahrenheight = (9.0/5.0)*celcius+32;
        return fahrenheight;
    }
}
