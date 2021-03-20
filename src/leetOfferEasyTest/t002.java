package leetOfferEasyTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class t002 {

    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        Boolean b = integerSet.add(1);
        System.out.println(b);
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = matrix.length, columns = matrix[0].length;
        int[][] map = new int[rows][columns];
        int ans[] =new int[columns*rows];
        right(matrix,0,0,map,ans);
        System.out.println(Arrays.toString(ans));
    }
    public static void right(int[][] matrix,int x,int y,int[][] map,int[] ans){
      int  count=0;
        while(map[x][y]!=1&&x<matrix.length-1&&y<matrix[0].length){
            map[x][y] = 1;
            ans[count] = matrix[x][y];
            y++;
            count++;
        }
    }
}
