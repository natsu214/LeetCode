package week01;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matr = new int[][]{{1,2,3},{4,0,6},{7,8,9},{1,1,1}};
        int n = matr.length;
        int m = matr[0].length;
        setZeros(matr);
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setZeros(int[][] matrix){
        if (matrix==null||matrix.length==0||matrix[0].length==0){
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rows = new int[m];
        int[] columns = new int[n];
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
            if (matrix[i][j]==0){
                rows[i] = 1;
                columns[j] = 1;
            }
            }
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i]==1||columns[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
