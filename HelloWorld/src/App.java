import java.util.ArrayList;
import java.util.Arrays;

public class App {
  public static int[] countBy(int x, int n){
    // Your code here
    int count = x;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      list.add(Integer.valueOf(count));
      count += x;
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(2,5)));
    }
}