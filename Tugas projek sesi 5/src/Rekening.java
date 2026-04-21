import java.util.ArrayList;

public class Rekening {
    protected String namaPemilik; // [cite: 12]
    protected String nomorRekening; // [cite: 13]
    protected double saldo; // [cite: 14]
    protected ArrayList<String> riwayatTransaksi; // [cite: 51]

    public Rekening(String nama, String nomor, double saldoAwal) {
        this.namaPemilik = nama;
        this.nomorRekening = nomor;
        this.saldo = saldoAwal;
        this.riwayatTransaksi = new ArrayList<>();
        this.riwayatTransaksi.add("Saldo Awal: Rp " + saldoAwal);
    }

    // Overloading Versi 1 [cite: 33]
    public void setor(double jumlah) {
        this.saldo += jumlah; // [cite: 16, 34]
        riwayatTransaksi.add("Setor Tunai: +Rp " + jumlah);
        System.out.println("Setor tunai berhasil: Rp " + jumlah);
    }

    // Overloading Versi 2 
    public void setor(double jumlah, boolean transfer) {
        if (transfer) {
            double biayaAdmin = 2500; // 
            this.saldo += (jumlah - biayaAdmin);
            riwayatTransaksi.add("Setor via Transfer: +Rp " + (jumlah - biayaAdmin) + " (Potong Admin)");
            System.out.println("Setor transfer berhasil. Admin Rp 2.500 dipotong dari penerima.");
        } else {
            setor(jumlah);
        }
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) { // [cite: 17]
            this.saldo -= jumlah;
            riwayatTransaksi.add("Tarik Tunai: -Rp " + jumlah);
            System.out.println("Tarik tunai berhasil: Rp " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    // Fitur Opsional: Transfer Antar Rekening [cite: 47]
    public void transfer(Rekening tujuan, double jumlah) {
        double biayaAdmin = 0;
        // Logika biaya admin opsional [cite: 49]
        if (this instanceof Giro && tujuan instanceof Tabungan) {
            biayaAdmin = 5000;
        }

        if (this.saldo >= (jumlah + biayaAdmin)) {
            this.saldo -= (jumlah + biayaAdmin);
            tujuan.saldo += jumlah;
            this.riwayatTransaksi.add("Transfer ke " + tujuan.nomorRekening + ": -Rp " + jumlah + " (Admin: " + biayaAdmin + ")");
            tujuan.riwayatTransaksi.add("Terima Transfer dari " + this.nomorRekening + ": +Rp " + jumlah);
            System.out.println("Transfer Rp " + jumlah + " ke " + tujuan.namaPemilik + " berhasil.");
        } else {
            System.out.println("Saldo tidak cukup untuk transfer.");
        }
    }

    public void tampilkanInfo() { // [cite: 18]
        System.out.println("Pemilik: " + namaPemilik);
        System.out.println("No. Rekening: " + nomorRekening);
        System.out.printf("Saldo: Rp %,.2f%n", saldo);
    }

    // Fitur Opsional: Cetak Laporan [cite: 51]
    public void cetakLaporan() {
        System.out.println("\n--- LAPORAN TRANSAKSI: " + namaPemilik + " ---");
        for (String log : riwayatTransaksi) {
            System.out.println(log);
        }
    }
}