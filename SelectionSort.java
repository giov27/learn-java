import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort{
  public static int[] sort(int[] sortArray, String sortArrange){
    boolean swap = true;
    int tmp, val, val_index;
    int[] arr = sortArray;
    String order = sortArrange;
    // System.out.println(order == "desc");
    for(int j = 0; j< arr.length; j++){
      val = arr[j];
      val_index = j;
      swap = false;
      for(int k = j+1; k< arr.length; k++){
        if(order.equals("desc")){
          if(val < arr[k]){
            val = arr[k];
            val_index = k;
            swap = true;
          }
        }else{
          if(val > arr[k]){
            val = arr[k];
            val_index = k;
            swap = true;
          }
        }
      }
      if(swap == true){
        tmp = arr[j];
        arr[j] = val;
        arr[val_index] = tmp;
      }
      // System.out.println(Arrays.toString(arr));
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
    System.out.print("Sort Arrangement(asc/desc) = " );
    sortArrange = myObj.next();
    int[] sortedArr = sort(arrInput, sortArrange);
    System.out.println(Arrays.toString(sortedArr));
  }
}