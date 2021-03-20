package ZuoGod;

import sort.Student;

import java.util.Arrays;

public class Merge001 {
    /**
     * 左神算法 小和问题 逆序问题
     * 核心：使用归并排序的思路
     * 题目：一个数组 [1,3,4,2,5] 某个数左边的所有数中比这个数小的，求和
     * 例如：1左边 没有
     *  3左边 1
     *  4左边 1,3
     *  3左边 1,
     *  5左边 1,3,4,2
     *  求总和
     *  思路：就是求某个数右边比它大的数的个数 向右看
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        System.out.println(mergeSort(arr,0,arr.length-1));
        System.out.println(Arrays.toString(arr));
        Student dfsdf = new Student(12, 12, "dfsdf");
        func(dfsdf);
        System.out.println(dfsdf);

    }
    static void func(Student s){
       s.setAge(100);
        return ;
    }

    static int smallSum(int[] arr){
        if (arr==null||arr.length==0)
          {   return 0; }
       else
          return    mergeSort(arr,0,arr.length-1);
    }
    static int mergeSort(int[] arr,int l,int r){
        if(l==r)
            return 0;
        int mid = (l+r)/2;
        return mergeSort(arr,l,mid)
                +mergeSort(arr, mid+1 ,r)
                +merge(arr, l,mid, r);
    }
    static int merge(int[] arr,int l ,int m , int r){
        int[] help = new int[r-l+1];
        int res = 0;
        int p1 = l;
        int p2 = m+1;
        int i = 0;
        while(p1 <= m && p2 <= r){
            //res += arr[p1] < arr[p2] ? (r-p2+1)*arr[p2] : 0;
            res += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= m){
            help[i++] = arr[p1++];
        }
        while(p2 <= r){
            help[i++] = arr[p2++];
        }
        for(i = 0;i < help.length;i++){
            arr[i+l] = help[i];
        }
        return  res;
    }
}
