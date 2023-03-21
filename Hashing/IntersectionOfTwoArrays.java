package Hashing;

import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {10,15,20,25,30,50};
        int[] arr2 = {30, 5, 15, 80};

        intersection(arr1, arr2);
        intersection1(arr1, arr2);
    }
    public static void intersection(int[] num, int[] num2) {
        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num2.length; j++) {
                if(num[i] == num2[j]) {
                    System.out.print(num[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void intersection1(int[] num, int[] num2) {
        Set<Integer> hash = new HashSet<>();

        for(int i : num2){
            hash.add(i);
        }
        for(int i : num){
            if(hash.contains(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
