
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop myLaptop;
        System.out.println("Pilih Laptop 1.Toshiba / 2.MacBook");

        int pilih = input.nextInt();
        if (pilih == 1) {
            myLaptop = new Toshiba();
        }else{
            myLaptop = new Macbook();
        }

        String Action;
        Boolean Running = true;

        System.out.println("[ON] Menylakan Laptop");
        System.out.println("[OFF] mematikan laptop");
        System.out.println("[UP] menambah volume");
        System.out.println("[DOWN] mengurangi Volume");
        System.out.println("[EXIT] menghiri perintah");

        while (Running) {
            System.out.println("Pilih Aksi");

            Action = input.next();
            
            if (Action.equalsIgnoreCase("ON")) {
                myLaptop.PowerOn();
            }else if (Action.equalsIgnoreCase("OFF")) {
                myLaptop.PowerOff();
            }else if (Action.equalsIgnoreCase("UP")) {
                myLaptop.volumeUp();
            }else if (Action.equalsIgnoreCase("DOWN")) {
                myLaptop.volumeDown();
            }else if (Action.equalsIgnoreCase("EXIT")) {
                Running = false;
                System.out.println("Sistem Berekhiri");
            } else {
                System.out.println("Perintah Tidak Ditemukan");
            }
        }
        input.close();
    }
}
