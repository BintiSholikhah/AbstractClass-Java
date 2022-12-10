public class Reamur extends Celcius {
    private double reamur;
    private double celcius;

    public Reamur(double celcius){
        this.celcius = celcius;
    }
    @Override
    double suhu(){
        reamur = (4.0/5.0)*celcius;
        return reamur;
    }
}
