public class Kelvin extends Celcius{
    private double kelvin;
    private double celcius;

    public Kelvin(double celcius){
        this.celcius = celcius;
    }

    @Override
    double suhu() {
        kelvin = celcius+273.15;
        return kelvin;
    }
}
