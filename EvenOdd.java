import java.util.Scanner;

public class EvenOdd{
  public static void main(String[] args){
    int x;
    Scanner myObj = new Scanner(System.in);
    System.out.print("Masukkan angka:");
    x = myObj.nextInt();
    // System.out.print(x);
    if(x % 2 == 0){
      System.out.print("Bilangan Genap");
    }else{
      System.out.print("Bilangan Ganjil");
    }
  }
}