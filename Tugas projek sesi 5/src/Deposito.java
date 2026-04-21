public class Deposito extends Rekening {
    private int jangkaWaktuBulan;
    private double sukuBunga;

    public Deposito(String nama, String nomor, double saldo, int jangka, double bunga) {
        super(nama, nomor, saldo);
        this.jangkaWaktuBulan = jangka;
        this.sukuBunga = bunga;
    }

    public void simulasiBunga() {
        // Rumus: sukuBunga * saldo * jangkaWaktuBulan
        double bunga = sukuBunga * saldo * jangkaWaktuBulan;
        this.saldo += bunga;
        riwayatTransaksi.add("Bunga Deposito: +Rp " + bunga);
    }

    @Override
    public void tarik(double jumlah) {
        // Penarikan sebelum jatuh tempo dikenakan denda 10% dari saldo
        double denda = 0.10 * saldo;
        this.saldo -= (jumlah + denda);
        riwayatTransaksi.add("Tarik Deposito (Denda 10%): -Rp " + (jumlah + denda));
        System.out.println("Tarik sebelum jatuh tempo. Denda dikenakan: Rp " + denda);
    }
}