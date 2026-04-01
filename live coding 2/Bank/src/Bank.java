public class Bank {

    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("--- Transfer Sesama Bank ---");
        System.out.println("Jumlah          : Rp" + jumlah);
        System.out.println("Rekening Tujuan : " + rekeningTujuan);
        System.out.println("Status          : Berhasil\n");
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("--- Transfer Antar Bank ---");
        System.out.println("Bank Tujuan     : " + bankTujuan);
        System.out.println("Rekening Tujuan : " + rekeningTujuan);
        System.out.println("Jumlah          : Rp" + jumlah);
        System.out.println("Status          : Berhasil\n");
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("--- Transfer dengan Berita ---");
        System.out.println("Bank Tujuan     : " + bankTujuan);
        System.out.println("Rekening Tujuan : " + rekeningTujuan);
        System.out.println("Jumlah          : Rp" + jumlah);
        System.out.println("Berita          : " + berita);
        System.out.println("Status          : Berhasil\n");
    }

    public void sukuBunga() {
        System.out.println("INFO: Suku Bunga standar adalah 3%\n");
    }
}

