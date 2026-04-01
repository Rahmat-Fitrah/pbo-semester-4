public class Main {

    public static void main(String[] args) {
        System.out.println("======== Struk Transfer Uang Bank Umum ========");
        Bank myBank = new Bank();
        myBank.sukuBunga();
        myBank.transferUang(500000, "1234567890");
        myBank.transferUang(1500000, "0987654321", "Bank BCA");
        myBank.transferUang(200000, "555666777", "Bank Mandiri", "Bayar Listrik");
        System.out.println("\n======== Struk Transfer Bank BNI & BCA ========");
        BankBNI BNI = new BankBNI();
        BNI.SukuBunga();
        BNI.TransferUang(43000000, "4237842834892", "BRI");
        System.out.println("Biaya Transfer Bank Rp : " + BNI.HitungBiaya("BRI"));

        System.out.println("===============================================");
        BankBCA BCA = new BankBCA();
        BCA.SukuBunga();
        BCA.TransferUang(54000000, "5482734893249", "BSI");
        System.out.println("Biaya Transfer Bank Rp : " + BCA.HitungBiaya("BSI"));
    }
}