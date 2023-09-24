import java.util.*;
import java.lang.*;

class Solution {
    public void rotate(int[][] matrix) {
        List<Integer> mylist = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                mylist.add(matrix[i][j]);
            }
        }
        Iterator i = mylist.iterator();
        while(i.hasNext()){
            for(int k=matrix.length-1;k>-1;k--){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][k]=(int)i.next();
                }
            }
        }
    }
}