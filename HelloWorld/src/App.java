public class App {
  public static String findNeedle(Object[] haystack) {
    // Your code here
    String result = " ";
    int index = 0;
    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i] == "needle") {
        index = i;
    }
    result = "found the needle at position " + index;
  }
    return result;
  }
public static void main(String[] args){
  
}
}