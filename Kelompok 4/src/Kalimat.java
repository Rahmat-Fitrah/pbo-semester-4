public class Kalimat{
public static void main(String[] args) {
    String teks = "rahmat fitrah";
    int jumlahKata = teks.trim().split(" ").length;

    System.out.println("Jumlah kata : " + jumlahKata);
}
}