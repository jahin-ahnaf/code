import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
  public static List<Object> filterList(final List<Object> list) {
    int count = 0;
    // Return the List with the Strings filtered out
    ArrayList<Integer> indexes = new ArrayList<Integer>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) instanceof String) {
        indexes.add(i);
      }
      
    }
    for (int i = 0; i < indexes.size(); i++){
      list.remove(indexes.get(i) - count);
      count++;
      
    }
    return list;
  }
public static void main(String[] args){
  List<Object> list = new ArrayList<Object>(Arrays.asList(1 , 2 , "a", "b"));
  System.out.println(App.filterList(list));
}
}