package Arrayspractice;

import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,5,20,8,50,100};
        System.out.println(secondLongestElement2(arr));
    }

    private static int secondLongestElement2(int[] arr) {
        int[] temp = arr;
        Arrays.sort(temp);
        int i = temp.length - 1;
        int second = Integer.MAX_VALUE;
        while(i > 0) {
            if(temp[i - 1] < temp[temp.length - 1]) {
                second = temp[i - 1];
                break;
            }
            i--;
        }

        for(int j = 0; j < arr.length; j++) {
            if(second == arr[j]) {
                return j;
            }
        }
        return -1;
    }


}
