import java.util.Scanner;
import java.lang.*;

public class Salary {
  public static void main(String[] args){
    int totalHours, salary, paidCategory;
    String name;
    char golongan;
    Scanner myObj = new Scanner(System.in);
    System.out.print("Name: ");
    name = myObj.next();
    System.out.print("Golongan kerja: ");
    golongan = myObj.next().charAt(0);
    System.out.print("Total working hours: ");
    totalHours = myObj.nextInt();
    // System.out.print(name + totalHours);
    switch(Character.toUpperCase(golongan)){
      case 'A':
        paidCategory = 25000;
        break;
      case 'B':
        paidCategory = 50000;
        break;
      case 'C':
        paidCategory = 75000;
        break;
      default:
        paidCategory = 25000;
        break;
    }
    if(totalHours < 40){
      salary = totalHours*paidCategory;
    } else {
      salary = ((totalHours-40)*50000)+totalHours*paidCategory;
    }
    System.out.println("Hello, " + name+"!");
    System.out.println("This is your salary this week: " + salary);
  }
}