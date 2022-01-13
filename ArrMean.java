import java.util.Scanner;
import java.lang.*;

public class ArrMean{
  public static void main(String[] args){
    int N, order, total=0;
    float res;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Jumlah Data:");
    N = scanner.nextInt();
    
    int[] arr = new int[N];
    for(int x=0; x< N; x++){
      order = x+1;
      System.out.print("Number "+ order + ":");
      arr[x] = scanner.nextInt();
      total += arr[x];
    }
    res = total/N;
    System.out.print("The mean of the array:"+ res);

  }
}