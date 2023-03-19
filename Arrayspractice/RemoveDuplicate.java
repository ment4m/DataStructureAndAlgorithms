package Arrayspractice;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};
        System.out.println(removeDup(arr));
    }

    public static int removeDup(int[] arr) {
        int j = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return ++j;
    }

    // time complexity = O(n)
    // space complexity = O(1)
}
