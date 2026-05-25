
import java.util.Scanner;

public class CustomExcept {
    //Perogram ticketing
    //Umur pembeli >= 17, katergori film "D"
    
    public void cekUmur(int umur){
        if (umur < 17) {
            throw new ArithmeticException("Umur anda Kurang");
        } else {
            System.out.println("Anda Diperbolehkan Membeli");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Isikan Umur anda");
        try {
            int umur = sc.nextInt();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        
    }
}
