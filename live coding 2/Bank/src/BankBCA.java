public class BankBCA {
    
    public void SukuBunga(){
        System.out.println("Suku Bunga Bank BCA Adalah 4.5%");
    }

    public void TransferUang(int Jumlah, String RekeningTujuan, String BankTujuan){
        String Bank = BankTujuan.isEmpty() ? "BCA" : BankTujuan;
        System.out.println("[BCA] Nominal Transfer Bank Rp : "+Jumlah+" No Rekening : "+RekeningTujuan+" Ke : "+Bank);
    }

    public int HitungBiaya(String BankTujuan){
        return BankTujuan.equalsIgnoreCase("BCA") ? 0 : 6500;
    }
}
