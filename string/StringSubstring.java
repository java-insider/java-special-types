package string;

public class StringSubstring {

    public static void main(String[] args) {

        String str = "java is the greatest language!";

        String substr1 = str.substring(4).trim();
        System.out.println(substr1);

        String substr2 = str.substring(4, str.length() - 1);
        System.out.println(substr2);
    }
}
