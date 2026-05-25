public class mobil1 {
    private String merk;
    private int kecepatan;
    private  boolean mesinMenyala;

    public mobil1(String merk) {
        this.merk = merk;
        this.mesinMenyala = false;
        this.kecepatan = 0;
    }

    // 1. method nyalakan
    public void nyalakan() {
        mesinMenyala = true;
        System.err.println(merk + "menyala. Siap meluncur!");
    }

    // 1 & 6 Method Matikan (Otomatis kecepatan jadi 0)
    public void Matikan () {
        mesinMenyala = false;
        kecepatan = 0;
        System.err.println(merk + "dimatikan. Kecepatan sekarang: " + kecepatan + " km/jam. ");
    }

    // 4, 5 & 7. Method gas
    public void gas () {
        if (mesinMenyala) {
            this.kecepatan += 5;
            System.out.println(merk + "Gas ditekan! Kecepatan sekarang: " + kecepatan + " km/jam. ");
        } else {
            System.out.println(merk + ": Gagal gas! mesin harus dinyalakan terlebih dahulu.");
        }
    }

    // 4, 6, & 7. Method rem
    public  void rem() {
        if (mesinMenyala) {
            // Logika agar kecepatan tidak minus
            if (this.kecepatan >= 5) {
                this.kecepatan -= 5;
            } else {
                this.kecepatan = 0;
            }
            System.out.println(merk + ": Rem ditekan. Kecepatan sekarang: " + kecepatan + " km/jam.");
        } else {
            System.out.println(merk + ": Gagal rem! Mesin sedang mati");
        }
    }

    // Main method untuk mencoba perogram
    public  static void Main(String[] args) {
        mobil1 mobilSaya = new 
    }
}
