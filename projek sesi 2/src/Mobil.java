public class Mobil{
    String warna;
    String merk;
    int kecepatan;
    

    //Constructor-> nama method yang sama dengan nama class
    //Tidak boleh ada void dan return value
    //Dijalankan hanya satu kali
    //Inisialisasi Data

    public Mobil(String warna, String merk){
        this.warna = warna;
        this.merk = merk;
        kecepatan = 0;
    }

    //Method ->Accessor(getter) & Mutator(setter)
    //Setter (void)
    public void setWarna(String color){
        warna = color;
    }

    public void setMerk(String brand){
        merk = brand;
    }

    //Getter
    public String getWarna(){
        return warna;
    }

    public String getMerk(){
        return merk;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void infoMobil(){
        System.out.println("Warna:" + getWarna());
        System.out.println("Merk:" + getMerk());
        System.out.println("Kecepatan:" + getKecepatan());
    }
}