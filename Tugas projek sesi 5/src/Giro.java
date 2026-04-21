public class Giro extends Rekening {
    private double limitPenarikan;

    public Giro(String nama, String nomor, double saldo, double limit) {
        super(nama, nomor, saldo);
        this.limitPenarikan = limit;
    }

    @Override
    public void tarik(double jumlah) {
        // Penarikan bisa melebihi saldo tapi tidak boleh melebihi limit giro [cite: 29]
        if (jumlah <= (saldo + limitPenarikan)) {
            this.saldo -= jumlah;
            riwayatTransaksi.add("Tarik Giro: -Rp " + jumlah);
            System.out.println("Tarik Giro berhasil: Rp " + jumlah);
        } else {
            System.out.println("Melebihi limit penarikan!");
        }
    }
}