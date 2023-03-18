package Arrayspractice;
import java.util.*;

public class LongestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,20,8, 50, 100};
        System.out.println(longestElement1(arr));
        System.out.println(longestElement2(arr));
    }

    public static int longestElement1(int[] arr) {
        int index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[index] <= arr[i] ) {
                index = i;
            }
        }
        return index;
    }
    // time complexity O(n)
    // space complexity O(1)

    public static int longestElement2(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            boolean flag = true;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                return i;
            }
        }
        return -1;
    }

    //time complexity O(n^2)
    //Space complexity O(1)
}
