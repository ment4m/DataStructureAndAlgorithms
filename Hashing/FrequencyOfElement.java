package Hashing;

import java.util.*;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {15,12,13,12,13,13,18};
        frequency1(arr);
        frequency2(arr);
    }
    public static void frequency1(int[] arr){
        boolean ischecked = false;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[j] == arr[i]) {
                    ischecked = true;
                    break;
                }
            }
            if(ischecked == true) {
                continue;
            }

            int counter = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    counter++;
                }
            }
            System.out.println(arr[i] + " " + counter);
        }
    }

    // time complexity = O(n^2)
    // space complecity = O(1)

    public static void frequency2(int[] arr) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int  i : arr) {
            hash.put(i , hash.getOrDefault(i , 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    // time complexity = O(n)
    // space complecity = O(1)

}
