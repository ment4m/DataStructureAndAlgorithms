import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "welcome to home";
        System.out.println(reverseword(str));
    }

    private static String reverseword(String str) {
        StringBuilder sb = new StringBuilder();
        String[] reverse = str.split(" ");
        for(int i = reverse.length - 1; i >= 0; i--) {
            sb.append(reverse[i]);
            sb.append(" ");
        }
        return(sb.toString());
    }

}
