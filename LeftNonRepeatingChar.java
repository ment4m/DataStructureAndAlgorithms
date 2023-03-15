import java.util.*;
public class LeftNonRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(leftNonRepeatingChar(str));
        System.out.println(leftNonRepeatingChar2(str));

    }

    private static int leftNonRepeatingChar(String str) {
        int[] freq = new int[26];
        for(int i = 0; i< str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int leftNonRepeatingChar2(String str) {
        Map<Character, Integer> hash = new HashMap<>();

        for(char c : str.toCharArray()){
            hash.put(c, hash.getOrDefault(c,0) + 1);
        }

        for(int i = 0; i < str.length(); i++) {
            if(hash.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }


}
