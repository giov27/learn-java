import java.util.Scanner;

public class Alghorithm1{
  public static void main(String[] args){
    int number;
    Scanner myObj = new Scanner(System.in);
    System.out.print("Number of stars = ");
    number = myObj.nextInt();
    for(int i = 1; i <= number; i++ ){
      for(int j = 1; j<=i; j++ ){
        System.out.print('*');
      }
      System.out.println();
    }
  }
}