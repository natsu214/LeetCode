package week01;

import java.util.Arrays;
import java.util.Stack;

public class leet {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";
        System.out.println(Check(s1,s2));
        System.out.println(func2("aaa"));

        String s3 = "wer  td tt   ";
        System.out.println(s3.substring(0, 9).replace(" ", "%20"));
        System.out.println("**********************************");
        String st = "aboba";
        System.out.println(func3(st));
    }
    public static boolean Check(String s1,String s2){
       char[] c1 = s1.toCharArray();
       char[] c2 = s2.toCharArray();
       Arrays.sort(c1);
       Arrays.sort(c2);
       return new String(c1).equals(new String(c2));


    }
    static int func1(int a1){
        return a1+100;
    }
    static String func2(String a1){
        return a1+"123";
    }
    static boolean func3(String s){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            Stack<Character> characterStack = new Stack<>();
            int len = chars.length;
            for (int i =0;i<len;i++){
                if (!characterStack.isEmpty() && chars[i] == characterStack.peek()) {
                    characterStack.pop();
                }
                else
                {
                    characterStack.push(chars[i]);
                }
            }
            return characterStack.size()==0||characterStack.size()==1;
    }
}
