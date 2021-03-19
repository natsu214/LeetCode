package week01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackOfPlates {
    public static void main(String[] args) {
        List<Stack<Integer>> list = new ArrayList<>();
        list.add(new Stack<>());
        list.get(0).push(8);
        list.get(0).push(3);
        System.out.println(list.get(0).pop());
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Stack<Integer> integers = new Stack<>();
        int [] arr = {0,1,2};
        System.out.println(arr.length);
    }
}
