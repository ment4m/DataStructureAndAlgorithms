package Arrayspractice;

import java.util.*;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        System.out.println(Arrays.toString(leaders(arr)));
        System.out.println(Arrays.toString(leaders2(arr)));
    }

    public static int[] leaders(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            boolean isLeader = false;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] <= arr[j]) {
                    isLeader = true;
                    break;
                }
            }
            if(isLeader == false) {
                list.add(arr[i]);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
    // time complexity = O(n^2)
    // space complexity = O(n)

    public static int[] leaders2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int maxNum = arr[arr.length - 1];
        list.add(maxNum);

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > maxNum) {
                maxNum = arr[i];
                list.add(maxNum);
            }
        }

        int[] ans = new int[list.size()];
        for(int i = list.size() - 1, j = 0; i >= 0; i--, j++){
            ans[j] = list.get(i);
        }

        return ans;
    }

    // time complexity = O(n)
    // space complexity = O(n)

}
