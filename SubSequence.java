public class SubSequence {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "ACD";
        System.out.println(checkSubSequence(str1, str2));
        System.out.println(checkSebSequence2(str1, str2, str1.length(), str2.length()));
        System.out.println(RecuCheckSebSequence(str1, str2, str1.length(), str2.length()));
    }

    public static boolean checkSubSequence(String str1, String str2) {
        int temp = 0;

        for(int i = 0; i < str2.length(); i++) {
            boolean isfound = false;
            for(int j = temp; j < str1.length(); j++) {
                if(str2.charAt(i) == str1.charAt(j)) {
                    isfound = true;
                    if(temp < str1.length()) {
                        temp++;
                    }
                    break;
                }
            }
            if(!isfound) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSebSequence2(String str1, String str2, int n, int m) {
        int i = 0;
        int j = 0;

        while(i < n  && j < m ) {
            if(str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }
            else {
                i++;
            }
        }
        if(j == m) {
            return true;
        }
        return false;
    }

    // Recursion method
    public static boolean RecuCheckSebSequence(String str1, String str2, int n, int m) {
        if (m == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return RecuCheckSebSequence(str1, str2, n - 1, m - 1);
        }
        else
            return RecuCheckSebSequence(str1, str2, n - 1, m);
    }
}
