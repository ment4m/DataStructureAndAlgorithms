package Arrayspractice;

import java.util.*;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 10};
        int d = 0;
        //System.out.println(Arrays.toString(leftRotatebyOne(arr)));
        System.out.println(Arrays.toString(leftRotatebyN(arr, d)));
        System.out.println(Arrays.toString(leftRotatebyN2(arr, d)));
    }

    public static int[] leftRotatebyOne(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] leftRotatebyN(int[] arr, int d) {
        int[] ans = new int[arr.length];
        int j = 0;
        for(int i = d; i < arr.length; i++) {
            ans[j++] = arr[i];
        }
        for(int i = 0; i < d; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }
    // time complexity = O(n)
    // space complexity = O(n)

    public static int[] leftRotatebyN2(int[] arr, int d) {
        int[] temp = new int[d];
        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for(int i = d; i < arr.length; i++) {
            arr[i -d] = arr[i];
        }
        for(int i = 0; i < temp.length; i++) {
            arr[arr.length - d + i] = temp[i];
        }
        return arr;
    }
    // time complexity = O(n)
    // space complexity = O(d)
}
