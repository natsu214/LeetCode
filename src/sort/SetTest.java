package sort;

import java.util.HashSet;
import java.util.Set;

public class SetTest {


    public static void main(String[] args) {
        Set<Student> hashSet =new HashSet<>();
        hashSet.add(new Student(1,22,"lihua"));
         boolean flag =   hashSet.add(new Student(1,22,"lihua"));
        System.out.println(flag);
    }
}
