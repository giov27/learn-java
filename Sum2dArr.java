import java.io.*;
import java.util.*;

public class Sum2dArr{
  public static void main(String[] args){
    int[][] arr1 = new int[][] {{5,2,1},{1,2,3},{8,6,3}};
    int[][] arr2 = new int[][] {{3,4,5},{2,1,9},{7,2,2}};
    int[][] arrRes = new int[3][3];

    for(int x = 0; x< arr1.length; x++){
      for(int y = 0; y< arr2.length; y++){
        System.out.println(arr1[x][y] + " " +arr2[x][y]);
        arrRes[x][y] = arr1[x][y] + arr2[x][y];
      }
    }
    System.out.print(Arrays.deepToString(arrRes));
  }
}