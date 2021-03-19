package sort;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] arr = {3,2,44,11,94,3232,11,3,0};
        insert(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void insert(int[] array){
        for(int i=0;i<array.length-1;i++){
            int current = array[i+1];
            int currentIndex = i;
            while(currentIndex>=0&&array[currentIndex]>current){
                array[currentIndex+1] = array[currentIndex];
                currentIndex--;
            }
            array[currentIndex+1] = current;
        }

    }
}
