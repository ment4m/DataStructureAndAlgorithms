import java.util.*;
public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "stlien";
        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram2(str1, str2));
        System.out.println(isAnagram3(str1, str2));
    }


    public static boolean isAnagram(String str1, String str2) {
//        listen       stlien
//
//         [ , , , , , , , , , , ]
        if(str1.length() != str2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a'] += 1;
            freq[str2.charAt(i) - 'a'] -= 1;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram2(String str1, String str2) {
        Map<Character, Integer> hash1 = new HashMap<>();
        Map<Character, Integer> hash2 = new HashMap<>();
        if(str1.length() != str2.length()) {
            return false;
        }
        for(char c : str1.toCharArray()) {
            hash1.put(c, hash1.getOrDefault(c , 0) + 1);
        }
        for(char c : str2.toCharArray()) {
            hash2.put(c, hash2.getOrDefault(c , 0) + 1);
        }

        for(char c : str1.toCharArray()) {
            if(hash1.get(c) != hash2.get(c)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isAnagram3(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        for(int i = 0; i < charStr1.length; i++) {
            if(charStr1[i] != charStr2[i]) {
                return false;
            }
        }
        return true;
    }
}
