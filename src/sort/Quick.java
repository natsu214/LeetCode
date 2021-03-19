package sort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {3,2,44,11,94,3232,11,3,0};
        Quick quick = new Quick();
        int length = arr.length;
        quick.quick(arr,0,length-1);
        System.out.println(Arrays.toString(arr));
    }
    public  void Quick(int[] arr,int l,int r){
        if(l<r){
            int i = AdjustArray(arr, l, r);
            Quick(arr,l,i-1);
            Quick(arr,i+1,r);
        }
    }
    public int AdjustArray(int[] arr,int l,int r){
        int i=l,j=r;
        int x = arr[l];
        while(i<j){
            while (i<j&&arr[j]>x){
                j--;
            }
          if(i<j){
              arr[i] = arr[j];
              i++;
          }
            while(i<j&&arr[i]<x){
                i++;
            }
            if(i<j){
                arr[j] = arr[i];
                j--;
            }

        }
        arr[i] = x;
        return i;
    }

    public void quick(int[]arr,int l,int r){
        if(l<r){
        int i=l,j=r,x=arr[l];
        while(i<j){
            while(i<j&&arr[j]>x){
                j--;
            }
            if(i<j){
                arr[i++] = arr[j];
            }
            while(i<j&&arr[i]<x){
                i++;
            }
            if(i<j){
                arr[j--] = arr[i];
            }
        }
        arr[i] = x;
        quick(arr,l,i-1);
        quick(arr,i+1,r);
        }
    }
}
