package Arrayspractice;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(isSroted(arr));
        System.out.println(isSroted2(arr));
    }

    private static boolean isSroted2(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isSroted(int[] arr) {
        if(arr.length == 1){
            return true;
        }
        int index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[index] > arr[i]) {
                return false;
            }
            index = i;
        }
        return true;
    }

}
