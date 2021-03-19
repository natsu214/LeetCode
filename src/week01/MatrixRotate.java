package week01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class MatrixRotate {
    public static void main(String[] args) {
        int[][] matr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = matr.length;
        rotate(matr);
        for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(matr[i][j]+" ");
                }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix){
        int n =matrix.length;
        int temp=0;
        for (int i=0;i<n/2;i++){
            for (int j=0;j<n;j++){
               temp = matrix[i][j];
               matrix[i][j] = matrix[n-i-1][j];
               matrix[n-i-1][j] = temp;
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if (i!=j){
                  temp =  matrix[i][j];
                  matrix[i][j] = matrix[j][i];
                  matrix[j][i] = temp;
                }
            }
        }
    }
}
