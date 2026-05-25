
import java.util.InputMismatchException;
import java.util.Scanner;

public class AritmaticExcept {
    public static void main(String[] args) {

        try{
            Scanner sc = new  Scanner(System.in);
            System.out.println("isikan Bilangan 1:");
            int val1 = sc.nextInt();
            System.out.println("isikan Bilangan 2:");
            int val2 = sc.nextInt();
            int result = val1 / val2;
            System.out.println("Hasil pembagian:" + result);
        }
        catch(ArithmeticException ae){
            System.out.println("tidak boleh pembagian dengan 0");
        }
        catch(InputMismatchException ime){
            System.out.println("isikan Input Angka");
        }
        finally{
            System.out.println("Progarm selesai");
        }

    }
}
