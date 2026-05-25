// Simpan di: MobilListrik.java
public class MobillListrik extends Kendaraan implements KendaraanListrik {
    private int kapasitasBaterai;

    public MobillListrik(String merek, int kapasitasBaterai) {
        super(merek); // Memanggil constructor Kelas Dasar
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Implementasi dari Interface
    @Override
    public void isiDaya() {
        System.out.println("Mobil " + merek + " sedang di-charge... Baterai: " + kapasitasBaterai + " kWh.");
    }

    // Override info dari Kelas Dasar (Opsional/Tambahan)
    @Override
    public void info() {
        super.info();
        System.out.println("Tipe: Mobil Listrik Ramah Lingkungan.");
    }
}