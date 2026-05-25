public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI SISTEM KENDARAAN ===\n");

        // Membuat objek dari kelas implementasi
        MobillListrik mobilSaya = new MobillListrik("Tesla Model 3", 75);

        // Memanggil method dari Kelas Dasar
        mobilSaya.info();

        // Memanggil method dari Interface
        mobilSaya.isiDaya();
        
        System.out.println("\nSimulasi selesai.");
    }
}
