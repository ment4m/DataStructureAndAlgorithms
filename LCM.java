public class LCM {
    public static void main(String[] args) {
        int a = 100, b = 5;
        System.out.println(lcm(a , b));
    }
    public static int lcm(int a, int b) {
        int rev = Math.max(a,b);
        while(true){
            if(rev % a == 0 && rev % b == 0) {
                break;
            }
            rev++;
        }
        return rev;
    }
}
