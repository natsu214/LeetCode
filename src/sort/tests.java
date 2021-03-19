package sort;

import java.util.Arrays;

public class tests {
    public static void main(String[] args) {
        int[] arr = {4,2,1,4,6,66,32,0};
        tests tests = new tests();
        tests.mysort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void bubble(int[] array){
        if (array == null || array.length == 0) {
            return;
        }
        int len = array.length;
        //外层：需要len-1次循环比较
        for (int i = 0; i < len-1; i++) {
            //内层:每次循环需要两两比较，每次比较后，将当前较大的数放在最后
            for (int j = 0; j < len-1-i; j++) {
                if (array[j] > array[j+1]) {
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                }
            }//end for
        }//end for
    }
    public static int[] MySort (int[] arr) {
        // write code here
        if(arr == null || arr.length == 0){
            return null;
        }
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public int[] mysort(int[] arr){
        quickSort(arr,0,arr.length-1);
        return arr;
    }

    /**
     *
     * 快速排序
     * 1、取基准点 一般是第一个
     * 2、进行分区 根据基准点分两个区 左边放大的 右边放小的
     * 3、继续分区 直到所有元素有序
     *
     * @param arr
     * @param left
     * @param right
     */
    public void quickSort(int[] arr,int left, int right){
        if(left<right){
            int point = partition(arr,left,right);
            quickSort(arr,left,point-1);
            quickSort(arr,point+1,right);
        }
    }

    /**
     * partition返回分隔值的位置 left==right时的索引值 这时 比 arr[left]小的都在左边  大的都在右边
     * 然后 继续根据arr[point]
     * quickSort（arr,left,point-1）
     * quickSort(arr,point+1,right)
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private int partition(int[] arr, int left, int right) {
        int first = arr[left];
        while (left < right) {
            while(left<right&&arr[right]>=first){
                right--;
            }
            swap(arr,left,right);
            while(left<right&&first>=left){
                left++;
            }
            swap(arr,left,right);
        }
        return left;//返回分割点的位置

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
