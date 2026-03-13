public class BujurSangkar extends BangunDatar{
    private double sisi;

    public BujurSangkar(double sisi){
        this.sisi = sisi;
    }

    public double luas() {
        return sisi * sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }
}
