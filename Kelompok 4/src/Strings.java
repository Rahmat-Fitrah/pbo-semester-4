public class Strings {
    public static void main(String[] args) {
        {// 1. Fungsi String length
        String txt = "nusa putra university";
        
        System.out.println("The length of the txt string is: " + txt.length());
        }

        {
        // 2. Fungsi More String Methods
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        }

        // 3. Fungsi Finding a Character in a String
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
    }
}
