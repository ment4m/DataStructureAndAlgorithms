public class GCD {
    public static void main(String[] args) {
        int a = 250;
        int b = 8;
        System.out.println(greaterCD(a , b));
    }

    private static int greaterCD(int a, int b) {
        int rev = Math.min(a , b);
        while(rev > 0){
            if(a % rev == 0 && b % rev == 0){
                break;
            }
            rev--;
        }
        return rev;
    }

//    private static int greaterCD(int a, int b) {
//        if(b % a == 0) {
//            return a;
//        }
//        if(a% b == 0) {
//            return b;
//        }
//        int i = 1;
//        int gcd = 0;
//        while(b >= i || a >= i) {
//            if(b%i == 0 && a % i == 0) {
//                gcd = i;
//            }
//            i++;
//        }
//        return gcd;
//    }

}
