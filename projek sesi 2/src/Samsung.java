public class Samsung {
     static String merk = "SAMSUNG";
    static String os = "Android";
    public static void main(String[] args) {
        Handphone h1 = new Handphone(merk);
        h1.setData("Samsun galaxy", "A51");

        Handphone h2 = new Handphone(merk);
        h2.setData("Samsung galaxy", "A51", 5000000);

        Handphone h3 = new Handphone();

        System.out.println("Merk : " + h1.merk);
        System.out.println("Type : " + h1.tipe);
        System.out.println("=================");
        System.out.println("Merk : " + h1.merk);
        System.out.println("Type : " + h1.tipe);
        System.out.println("Harga : " + h2.harga);
        System.out.println(h3);

        
    }
    public void infoSmartphone(){
        super.infoSmartphone("OS : " + os);
    }
}
