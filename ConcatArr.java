import java.util.Arrays;

public class ConcatArr{
  public static void main(String[] args){
    String[] str1 = new String[] {"Farma", "Global", "Tech"};
    String[] str2 = new String[] {"Botol", "Biru", "Kuning", "Nasi"};
    int resLen = str1.length + str2.length;
    String[] strRes = new String[resLen];
    for(int x=0; x<str1.length; x++){
      strRes[x] = str1[x];
    }
    for(int y=0; y< str2.length ; y++ ){
      strRes[str1.length+y] = str2[y];
    }
    System.out.print(Arrays.toString(strRes));
  }
}