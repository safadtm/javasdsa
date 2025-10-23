package mypack;

public class matrix {
    public void print(int[][] a,int m,int n){

        System.out.println("MATRIX ELEMENTS ARE");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
