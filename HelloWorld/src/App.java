import java.util.Arrays;

public class App {
    public static int sum(int[] numbers)
  {
    Arrays.sort(numbers);
    int ans, i = 0;
    if (numbers.length > 1){
        do {
            ans = numbers[i];
        }
        while (numbers.length < i);
        return ans;
    }
    return 0;
  }
    public static void main(String[] args) {
        
    }
}