public class Segitiga extends BangunDatar{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        return 3 * alas;
    }
}
