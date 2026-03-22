public class ObjekMobil {
     public static void main(String[] args) {
        Mobil mobilku = new Mobil("Merah", "Toyota");
        mobilku.infoMobil();
        mobilku.setWarna("Hijau");
        mobilku.setMerk("Honda");
        mobilku.infoMobil();

        String warnaMobil = mobilku.getWarna();
        System.out.println("Saya membeli mobil warna:" +warnaMobil);
    } 
}
