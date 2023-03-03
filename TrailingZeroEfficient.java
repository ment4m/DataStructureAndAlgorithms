public class TrailingZeroEfficient {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(factorialZero(num));
    }

    private static int factorialZero(int num) {
        int ans = 0;
        for(int i = 5; i <= num; i *= 5) {
            ans += num / i;
        }
        return ans;
    }
}
