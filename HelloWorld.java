public class HelloWorld{
  public static void main(String args[]){
    int jumlah = Integer.parseInt(args[0]);
    int[] arr = new int[jumlah];
    // or
    // int[] arr1;
    // arr1 = new int[6]

    for(int x=0; x<jumlah; x=x+1){
      arr[x] = x;
      System.out.println("Hello World");
      System.out.println(arr[x]);
    };
    // System.out.print(arr);

  }
}