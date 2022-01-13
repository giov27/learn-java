public class Function1{

  static String couple(){
    String coupleName="Sakura";
    return coupleName;
  }
  static void naruto(String title){
    System.out.println("Naruto Uzumaki " + title +" "+ couple());
  }
  static void random(){
    System.out.println("Yondaime " + "Hokage " +4);
  }

  public static void main(String[] args){
    naruto(args[0]);
    random();
  }
}