public class PalindromeString {
    public static void main(String[] args) {
        String str = "abcghaia";
        System.out.println(palindrome(str));
        System.out.println(NaivePalindrome(str));
    }

    public static boolean NaivePalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if(str.equals(sb.toString())) {
            return true;
        }
        return false;
    }
    private static boolean palindrome(String str) {
//       str = abcdcba        i   j
//                            0   6
//                            1   5
//                            2   4
//                            3   3
//                            4   2
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
