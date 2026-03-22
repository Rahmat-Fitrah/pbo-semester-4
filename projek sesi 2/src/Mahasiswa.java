public class Mahasiswa{
    String nama;
    String alamat;
    int umur;

    public Mahasiswa(String nama, String alamat, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur; 
    }

    public String getnama(){
        return nama;
    }

    public String getalamat(){
        return alamat;
    }

    public int getumur(){
        return umur;
    }
    
    public String getinfo(){
        String result = "nama :" + getnama();
        result += "\nalamat :" + getalamat();
        result += "\numur :" + getumur();

        return result;
    }
}