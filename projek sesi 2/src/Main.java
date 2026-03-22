import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Isikan Nama:");
        String nama = sc.next();

        System.out.println("Isikan Alamat:");
        String alamat = sc.next();

        System.out.println("Isikan Umur:");
        int umur = sc.nextInt();

        MahasiswaTI m1 = new MahasiswaTI(nama, alamat, umur);
        m1.setNilaiPBO(90);
        m1.infoMahasiswaTI();
    }
}