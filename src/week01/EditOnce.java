package week01;

public class EditOnce {
    public static void main(String[] args) {
        String s1="aaa";
        String s2="aabc";
        System.out.println(editOnce(s1,s2));
    }
    public static boolean editOnce(String first,String second){
       if (first==null||second==null)
           return false;
       int len1 = first.length();
       int len2 = second.length();
       if (Math.abs(len1-len2)>1){
           return false;
       }
       if (len1<len2){
        return    editOnce(second,first);
       }
      for (int i=0;i<len2;i++){
          if (first.charAt(i)!=second.charAt(i)){
            return   first.substring(i+1).equals(second.substring(len1==len2?i+1:i));
          }
      }
      return true;
    }
}
