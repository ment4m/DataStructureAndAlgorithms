import java.util.*;

public class LeftRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(leftRepeatChar(str));
        System.out.println(leftRepeatChar2(str));
        System.out.println(leftRepeatChar3(str));
    }

    public static int leftRepeatChar(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int leftRepeatChar2(String str) {
        Map<Character, Integer> hash = new HashMap<>();
        for(char c : str.toCharArray()) {
            hash.put(c, hash.getOrDefault(c , 0) + 1);
        }
        for(int i = 0; i < str.length(); i++) {
            if(hash.get(str.charAt(i)) > 1) {
                return i;
            }
        }

        return -1;
    }

    public static int leftRepeatChar3(String str) {
        int[] freq = new int[26];
        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i) - 'a'] > 1) {
                return i;
            }
        }
        return -1;
    }
}
