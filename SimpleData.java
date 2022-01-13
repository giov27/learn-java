import java.util.Scanner;
import java.util.ArrayList;

public class SimpleData{
  static ArrayList listBarang = new ArrayList();
  static boolean isRunning = true;
  static Scanner myObj = new Scanner(System.in);

  static void showMenu(){
    System.out.println("====MENU====");
    System.out.println("[1] Show All Item");
    System.out.println("[2] Insert Item");
    System.out.println("[3] Edit Item");
    System.out.println("[4] Delete Item");
    System.out.println("[5] EXIT");
    System.out.println("Choose The Menu > ");

    int selectedMenu = myObj.nextInt();
    switch(selectedMenu){
      case 1:
        showAllItem();
        break;
      case 2:
        insertItem();
        break;
      case 3:
        editBarang();
        break;
      case 4:
        deleteBarang();
        break;
      case 5:
        System.exit(0);
        break;
      default:
        System.out.println("Fault Choice")
    }
  }
  public static void main(String[] args){

  }
}