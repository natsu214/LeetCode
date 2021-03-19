package week01;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.add(1);
        integers.add(3);
        integers.add(8);
        integers.peek();
   System.out.println(integers.pop());
    }
}

