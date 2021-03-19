package sort;

import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        int[] arr = {3,2,44,11,94,3232,11,3,0};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void select(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i;j<arr.length;j++){
                if (arr[minIndex]>arr[j]){
                   minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return ;
    }
}
