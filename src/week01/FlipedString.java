package week01;

public class FlipedString {
    public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "abcdefgh";
        //System.out.println(isFlipedString(s1,s2));

        StringBuilder sb = new StringBuilder(s2);
        System.out.println(sb);
        String s3 = s2.substring(1);
        System.out.println(s3);
       // 包括newindex不包括oldindex
        int n = s2.length();
        sb.charAt(n-1);
        System.out.println(sb.replace(0, n - 1, s3));
    }
    public static boolean isFlipedString(String s1,String s2){
        if (s1.length()-s2.length()>0){
            return false;
        }
        int n = s1.length();
        StringBuilder sb = new StringBuilder(s2);
        for (int i =0;i<n;i++){
            if (s1.equals(sb.toString())){
                return true;
            }else {
            char c = sb.charAt(0);
           // sb.replace(0,n-2,sb.substring(1));
         //   sb.append(s1.substring());
            }
        }return false;
    }
}
