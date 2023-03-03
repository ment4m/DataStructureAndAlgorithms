public class PalindromeNumber {
    static boolean isPalindrome(int x) {
        String str = Integer.toString(x);

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

    public static void main(String[] args) {
        int x = 56;
        System.out.println(isPalindrome(x));
    }
}
