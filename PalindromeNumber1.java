public class PalindromeNumber1 {
    static boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        int num = 0;
        while(x > 0){

            num = x % 10;
            rev = rev * 10 + num;
            x = x / 10;
        }
        System.out.println(rev);
        return(org == rev);
    }

    public static void main(String[] args) {
        int x = 7644567;
        System.out.println(isPalindrome(x));
    }
}
