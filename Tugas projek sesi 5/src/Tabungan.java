public class Tabungan extends Rekening {
    private double bungaTahunan; // [cite: 22]

    public Tabungan(String nama, String nomor, double saldo, double bunga) {
        super(nama, nomor, saldo); // Memanggil constructor Rekening [cite: 20]
        this.bungaTahunan = bunga;
    }

    public void hitungBunga(int bulan) {
        // Rumus Bunga: (bunga/100 / 12) * saldo * bulan [cite: 26]
        double bunga = (this.bungaTahunan / 100 / 12) * this.saldo * bulan;
        this.saldo += bunga;
        this.riwayatTransaksi.add("Bunga Tabungan (" + bulan + " bln): +Rp " + bunga);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Menampilkan info dasar dari class Rekening [cite: 18]
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%"); // [cite: 23]
    }
}