import java.io.CharArrayReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
  public static double sum(double[] numbers) {
    double sum = 0;
    if (numbers.length == 0) {
      sum = 0;
    }
    else {
      for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
      }
    }
    return sum;
  }
public static void main(String[] args){
  
}
}