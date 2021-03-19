package sort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        int[] arr = {3,5,6,90,22,31,55};
        heapSort(arr);
       // int[] test = {31,22,55,3,6,5,90};
      //  heapify(test,0,test.length-1);
        System.out.println(Arrays.toString(arr));

        PriorityQueue<Student> heap = new PriorityQueue<>(new StuComparator());
        heap.add(new Student(33,22,"tom"));
        heap.add(new Student(44,11,"amy"));
        heap.add(new Student(77,22,"judy"));
        heap.add(new Student(34,25,"eric"));
        while(!heap.isEmpty()){
            Student cur = heap.poll();
            System.out.println(cur.name+" id: "+cur.id+"age:" + cur.age);
        }

    }
    //传进来一个arr数组
    public static void heapSort(int[] arr){
        if(arr==null||arr.length<2){
        return;
    }//形成大根堆
        for(int i = 0;i<arr.length;i++){
        heapInsert(arr,i);
    }
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while(heapSize>0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }

    }
    //能建好一个大根堆
    public static void heapInsert(int[] arr,int index){
        while(arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //从index位置一直下沉 直到1.没有孩子比他大了 或者 2.到底了
    public static void heapify(int[] arr,int index,int heapSize){
        int left = (index*2)+1;//左孩子index
        //当左孩子不越界 能保证左右孩子均不越界 左孩子越界 停 没孩子了到底了 从上往下调整大根堆
        while(left<heapSize){
            //先看左右孩子谁大 如果有右孩子的话 看左右孩子谁大 谁大把下标给largest

            int largest = left+1<heapSize && arr[left+1]>arr[left]? left+1:left;
            largest = arr[largest]>arr[index]?largest:index;
            //arr[index]跟大孩子比 如果比孩子大 无了 比孩子小 下沉交换值 index变化
            if(largest == index){
                break;
            }
            swap(arr,index,largest);
            index = largest;
            left = 2*index+1;
        }
    }
}
