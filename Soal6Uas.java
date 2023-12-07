package soal6uas;
public class Soal6Uas {
    public static void main(String[] args) {
        String kata = "katak";
        if (isPalindrom(kata)) {
            System.out.println(kata + " adalah palindrom");
        } else {
            System.out.println(kata + " bukan palindrom");
        }
    }
    
    public static boolean isPalindrom(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }
}
