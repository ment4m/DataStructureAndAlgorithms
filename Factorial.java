public class Factorial {
    static int factorial(int x) {
        int num = 1;
        for(int i = 1; i <= x; i++) {
            num *= i;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
