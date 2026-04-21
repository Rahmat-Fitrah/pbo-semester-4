import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // PERBAIKAN: Membuat objek ArrayList terlebih dahulu
        ArrayList<Rekening> daftarRekening = new ArrayList<>();

        // Membuat objek nasabah
        Tabungan t1 = new Tabungan("Andi", "T101", 5000000, 5);
        Giro g1 = new Giro("Budi", "G201", 10000000, 2000000);
        Deposito d1 = new Deposito("Citra", "D301", 20000000, 6, 0.01);

        // Menambahkan ke list
        daftarRekening.add(t1);
        daftarRekening.add(g1);
        daftarRekening.add(d1);

        // Simulasi Transaksi
        System.out.println("=== PROSES TRANSAKSI ===");
        t1.setor(500000, true); 
        g1.transfer(t1, 1000000); // Fitur Transfer [cite: 47, 49]
        d1.tarik(5000000); 

        // Simulasi Bunga Bulanan Otomatis (Looping) [cite: 50]
        System.out.println("\n=== SIMULASI BUNGA OTOMATIS (6 BULAN) ===");
        for (Rekening r : daftarRekening) {
            if (r instanceof Tabungan) {
                ((Tabungan) r).hitungBunga(6);
            } else if (r instanceof Deposito) {
                ((Deposito) r).simulasiBunga();
            }
        }

        // Menampilkan Info Rekening dan Statistik [cite: 45]
        System.out.println("\n=== DAFTAR SEMUA REKENING ===");
        Rekening tertinggi = daftarRekening.get(0);
        Rekening terendah = daftarRekening.get(0);

        for (Rekening r : daftarRekening) {
            r.tampilkanInfo();
            System.out.println("--------------------");
            
            // Logika saldo tertinggi/terendah
            if (r.saldo > tertinggi.saldo) tertinggi = r;
            if (r.saldo < terendah.saldo) terendah = r;
        }

        System.out.printf("Saldo Tertinggi: %s (Rp %.0f)%n", tertinggi.namaPemilik, tertinggi.saldo);
        System.out.printf("Saldo Terendah: %s (Rp %.0f)%n", terendah.namaPemilik, terendah.saldo);

        // Cetak Laporan Riwayat Transaksi [cite: 51]
        for (Rekening r : daftarRekening) {
            r.cetakLaporan();
        }
    }
}