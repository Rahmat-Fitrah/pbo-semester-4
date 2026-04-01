public class Main {
    public static void main(String[]args) {
        BujurSangkar bs = new BujurSangkar(5);
        PersegiPanjang pp = new PersegiPanjang(6, 4);
        Segitiga st = new Segitiga(10, 8);

        System.out.println("=== BUJUR SANGKAR (Sisi: 5) ===");
        System.out.println("Luas :" +bs.luas());
        System.out.println("Keliling :" + bs.keliling());

        System.out.println("=== Persegi Panjang (6x4) ===");
        System.out.println("Luas: " +pp.luas());
        System.out.println("Keliling: " + pp.keliling());

        System.out.println("=== Segitiga (Alas:10, Tinggi:8) ===");
        System.out.println("Luas:" +st.luas());
        System.out.println("keliling: " +st.keliling());
    }
}
