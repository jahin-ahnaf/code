import java.util.Arrays;

public class App {
  public static String[] solution(String s) {
    //Write your code here
    String[] arr = null;
    if (s.length() % 2 == 0) {
      arr = new String[s.length()];
      for (int i = 0; i < s.length() / 2; i++) {
        arr[i] = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
      }
    }
    return arr;
}
public static void main(String[] args){
  System.out.println(Arrays.toString(solution("abcdef")));
}
}