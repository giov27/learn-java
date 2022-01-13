import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort{
  public static int[] sort(int[] sortArray, String sortArrange){
    boolean check = true;
    int tmp;
    int[] arr = sortArray;
    String order = sortArrange;
    while(check == true){
      check = false;
      for(int j = 0; j < arr.length-1; j++){
        if(order == "asc"){
          if(arr[j] > arr[j+1]){
            tmp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tmp;
            check = true;
          }
        }else{
          if(arr[j] < arr[j+1]){
            tmp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tmp;
            check = true;
          }
        }
      }
    }
    return arr;
  }
  public static void main(String[] args){
    int len;
    String sortArrange;
    Scanner myObj = new Scanner(System.in);
    System.out.print("Set the array length  = ");
    len = myObj.nextInt();

    int[] arrInput = new int[len];
    for(int i = 0; i < len ; i++){
      System.out.print("Number["+i+"] = " );
      arrInput[i] = myObj.nextInt();
    }
    System.out.print("Sort Arrangement(asc/desc) =" );
    sortArrange = myObj.next();
    int[] sortedArr = sort(arrInput, sortArrange);
    System.out.println(Arrays.toString(sortedArr));
  }
}

