import java.util.ArrayList;
import java.util.Arrays;
class Array{
    public static void main(String[] args){
        int [][] mat={
            {4,7,1,8},{3,8,9,5},{1,3,4,5},{8,1,5,6},{0,0,0,0}
        };
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                mat[4][j]+=mat[i][j];
            }
        }
        for (int [] arr:mat){
            System.out.println(Arrays.toString(arr));
        }
    }
}
