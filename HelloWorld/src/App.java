import java.io.CharArrayReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
  public static Object[] removeEveryOther(Object[] arr) {
    Object[] newArr;
    // happy coding
    if (arr.length % 2 == 0) {
      newArr = new Object[arr.length / 2];
    }
    else {
      newArr = new Object[(arr.length - 1) / 2 + 1];
    }
    for (int i = 0; i < newArr.length; i++) {
      newArr[i] = arr[i * 2];
    }
    newArr[0] = arr[0];
    return newArr;
  }

public static void main(String[] args){
  
}
}