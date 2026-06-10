import java.io.File;

public class BuatFile {
    public static void main(String[] args) {
        File f = new File("D:\\1 data hp 14s\\Tugas Kampus\\Semester 4");
        try {
            if (f.createNewFile()) {
                System.out.println("File berhasil dibuat");
            }
            else{
                System.out.println("File sudah ada");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
