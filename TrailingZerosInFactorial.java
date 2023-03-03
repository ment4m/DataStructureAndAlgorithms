public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(trialingZeros(num));
    }

    private static int trialingZeros(int value) {
        int count = 0;
        long factorial = 1;
        System.out.println(factorial);
        for(long i = 2; i <= value; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        while(factorial > 0) {
            long rem = 0;
            rem = factorial % 10;
            if(rem == 0){
                count++;
            }
            else
                break;
            factorial /= 10;
        }
        return count;
    }
}
