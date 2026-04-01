public class BankBNI {

    public void SukuBunga(){
        System.out.println("Suku Bunga Bank BNI Adalah 4%");
    }

    public void TransferUang(int Jumlah, String RekeningTujuan, String BankTujuan){
        String Bank = BankTujuan.isEmpty() ? "BNI" : BankTujuan;
        System.out.println("[BNI] Nominal Transfer Bank Rp : "+Jumlah+" No Rekening : "+RekeningTujuan+" Ke : "+Bank);
    }

    public int HitungBiaya(String BankTujuan){
        return BankTujuan.equalsIgnoreCase("BNI") ? 0 : 6000;
    }
}