import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static int sum(int[] numbers){
        int result = 0;
        ArrayList<Integer> bruh = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            bruh.add(numbers[i]);
        }
        Collections.sort(bruh);
        bruh.remove(0);
        bruh.remove(numbers.length - 1);
        return bruh.get(0);
    }
    public static void main(String[] args) {
        int[] numbers = {10,50,3,4};
        System.out.println(sum(numbers));
    }
}