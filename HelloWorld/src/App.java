import java.util.ArrayList;

public class App {
  public static String repeatStr(final int repeat, final String string) {
    String ans = "";
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < repeat; i++) {
        list.add(string);
    }
    for (int i = 0; i < list.size(); i++){
      ans += list.get(i);
    }
    if (string.length() > 0 && repeat > 0){
      return ans;
    }
    else {
      return "";
    }
}
    public static void main(String[] args) {
        System.out.println(repeatStr(8, "Hello"));
    }
}