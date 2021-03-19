package sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {3,2,44,11,94,3232,11,3,0};
        bubble(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j = 0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
