package Arrayspractice;

import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {4,7,90,35,67,100};
        System.out.println(Arrays.toString(reverse1(arr)));
        System.out.println(Arrays.toString(reverse2(arr)));
    }

    public static int[] reverse1(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
    // Time complexity =  O(n)
    // Space complexity = O(n)

    public static int[] reverse2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
    // Time complexity = O(n)
    // Space complexity = O(1)

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
