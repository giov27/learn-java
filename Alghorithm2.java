import java.util.Scanner;

public class Alghorithm2{
  public static void main(String[] args){
    int number;
    // int k = 0;
    Scanner myObj = new Scanner(System.in);
    System.out.print("Number of stars = ");
    number = myObj.nextInt();
    for(int i = 1; i <= number; i++ ){
      for(int j = 1; j<=i; j++ ){
        if(j == i || i == number || j == 1){
          System.out.print("*");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}