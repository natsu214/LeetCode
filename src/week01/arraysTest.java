package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraysTest {
    public static void main(String[] args) {
        int[] test={1,2,3,4,5,4,3,2,1};
        StringBuilder sb =new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.length();
        System.out.println(sb.charAt(0));
        StringBuilder s=sb;
        System.out.println(sb==s.reverse());
        List<Integer> list = new ArrayList<>();
    }
}
