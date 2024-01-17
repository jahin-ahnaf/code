public class App {
    public static String correct(String string) {
        String ans = "";
        char[] bruh = string.toCharArray();
        for (int i = 0; i < bruh.length; i++){
            if (bruh[i] == '1'){
                bruh[i] = 'I';
            }
            if (bruh[i] == '5'){
                bruh[i] = 'S';
            }
            if (bruh[i] == '0'){
                bruh[i] = 'O';
            }
            ans += bruh[i];
        }
        return ans;
      }
    public static void main(String[] args) {
        System.out.println(correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA"));
    }
}