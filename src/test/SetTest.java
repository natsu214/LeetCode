package test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set.add(1));
        System.out.println(set);
        Set<Integer> reset = new HashSet<>();
    }
}
