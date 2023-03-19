package Arrayspractice;

import java.util.*;

public class MovingZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {8,5,0,10,0,0,20};
        System.out.println(Arrays.toString(movingZero(arr)));
    }

    public static int[] movingZero(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                swap(arr, i , j);
                j++;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
