public class Main {
    public static void main(String[] args) {
        Celcius reamur = new Reamur(30);
        Celcius fahrenheight = new Fahrenheight(30);
        Celcius kelvin = new Kelvin(30);

        System.out.println("Binti Sholikhah - 2100018299\n");
        System.out.println("===========================================");
        System.out.println("      KONVERSI SUHU DARI CELCIUS");
        System.out.println("===========================================");
        System.out.println(" Suhu 30 Derajat CELCIUS sama dengan:");
        System.out.println(" --> "+reamur.suhu()+" derajat REAMUR ");
        System.out.println(" --> "+fahrenheight.suhu()+" derajat FAHRENHEIGHT ");
        System.out.println(" --> "+kelvin.suhu()+" derajat KELVIN");
        System.out.println("===========================================");
    }
}