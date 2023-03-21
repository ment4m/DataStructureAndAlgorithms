package Hashing;

import java.util.*;

public class CountDistinctElement {
    public static void main(String[] args) {
        int[] arr = {15,12,13,12,13,13,18};
        System.out.println(distinctElement(arr));
    }

    public static int distinctElement(int[] arr) {
        Set<Integer> hash = new HashSet<>();

        for(int num : arr) {
            hash.add(num);
        }
        return hash.size();
    }
}
