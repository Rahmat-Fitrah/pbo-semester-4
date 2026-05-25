public class ArrayExcept {
    public static void main(String[] args) {
        int datanilai [] = {100,90,90,75,60,67};
        String nama [] = null;
        try {
            System.out.println(nama.length);
            for(int i=0;i<datanilai.length;i++){
                System.out.println(datanilai[i]);
            }
            System.out.println(datanilai[9]);
        }
        catch(ArrayIndexOutOfBoundsException aob){
            System.out.println("array melebihi batas");
        }
        catch(NullPointerException npe){
            System.out.println("Data masih kosong");
            System.out.println("messeng :" + npe.getMessage());
        }
        finally{
            System.out.println("Program Selsai");
        }
    }
}
