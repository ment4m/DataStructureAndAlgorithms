public class PrimeCheck {
    public static void main(String[] args) {
        int x = 40;
        System.out.println(primeCheck(x));
        System.out.println(primeCheck2(x));
        System.out.println(primeCheck3(x));
    }
    public static boolean primeCheck(int x){
        if(x == 1)
            return false;
        for(int i = 2; i < x; i++){
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
    // optimaizing the function
    public static boolean primeCheck2(int x){
        if(x == 1)
            return false;
        for(int i = 2; i*i < x; i++){
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean primeCheck3(int x){
        if(x==1) return false;
        if(x == 2 || x == 3) return true;
        if(x % 2 == 0 || x % 3 == 0) return false;

        for(int i = 5; i*i < x; i += 6){
            if(x % i == 0 || x % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
