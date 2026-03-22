public class Handphone {
    String merk;
    String tipe;
    int harga;

    public Handphone(String merk){
        this.merk = merk;
    }

    public Handphone(){
        this.merk = merk;
    }

    public void setData(String merk, String tipe){
        this.merk = merk;
        this.tipe = tipe;
    }

    public void setData(String merk, String tipe, int harga){
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    public void infoSmartphone(){
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
    }
}