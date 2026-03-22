public class MahasiswaTI extends Mahasiswa{
    float nilaiPBO;
    public MahasiswaTI(String nama, String alamat, int umur){
        super(nama, alamat, umur);
        nilaiPBO = 60;
    }

    public void setNilaiPBO(float nilai) {
        nilaiPBO = nilai;
    }

    public void infoMahasiswaTI(){
        System.out.println(super.getinfo());
        System.out.println("Nilai PBO:" + nilaiPBO);
    }
}