import java.io.*;
import java.util.*;

public class PrimeNumbers{
  public static void main(String[] args){  
    int x = 2;
    //PRIME NUMBERS with while loop 

    // while(x<=100){
    //   if (x == 2 || x == 3 || x == 5){
    //     System.out.println("Prime Number:" + x);
    //     x++;
    //   }else if (x%2 == 0 || x%3 == 0 || x%5 == 0 || x%7 == 0){
    //     x++;
    //     continue;
    //   }else{
    //     System.out.println("Prime Number:" + x);
    //     x++;
    //   }
    // }

    // PRIME NUMBER with do while
    do{      
      if (x == 2 || x == 3 || x == 5){
        System.out.println("Prime Number:" + x);
        x++;
      }else if (x%2 == 0 || x%3 == 0 || x%5 == 0 || x%7 == 0){
        x++;
        continue;
      }else{
        System.out.println("Prime Number:" + x);
        x++;
      }
    }while(x<=100);

  // PRIME NUMBER with for loop
  
    // for(int x=2; x<=100; x++){
    //   if (x == 2 || x == 3 || x == 5){
    //     System.out.println("Prime Number:" + x);
    //   }else if (x%2 == 0){
    //     continue;
    //   }else if(x%3 == 0){
    //     continue;
    //   }else if(x%5 == 0){
    //     continue;
    //   }else if(x%7 == 0){
    //     continue;
    //   }else{
    //     System.out.println("Prime Number:" + x);
    //   }
    // }
  }
}