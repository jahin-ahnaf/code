public class App {
  public static String accum(String s) {
    // your code
    int count = 0;
    s = s.toLowerCase();
    char[] bruh = s.toCharArray();
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        count++;
        ans.append(Character.toUpperCase(bruh[i]));
        for (int j = 1; j < count; j++){
          Character.toLowerCase(bruh[i]);
          ans.append(bruh[i]);
        }
        if(i < s.length() - 1){
          ans.append("-");
        }
    }
    return ans.toString();
   }
    public static void main(String[] args) {
        System.out.println(accum("abcde"));
    }
}