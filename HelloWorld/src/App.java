public class App {
    // your code
    public static Integer calculateTip(double amount, String rating) {
      // tip tap
      int tip = 0;
      double finalTip = 0;
      String newRatting = rating.toLowerCase();
      
      if (!newRatting.equals("terrible") && !newRatting.equals("poor") && !newRatting.equals("good") && !newRatting.equals("great") && !newRatting.equals("excellent")){
        return null;
      }
      else if (newRatting.equals("terrible")){
        tip = 0;
      }
      else if (newRatting.equals("poor")){
        tip = 5;
      }
      else if (newRatting.equals("good")){
        
        tip = 10;
      }
      else if (newRatting.equals("great")){
        tip = 15;
      }
      else if (newRatting.equals("excellent")){
        tip = 20;
      }
      
      finalTip = (double) (amount * tip / 100);
      Math.round(finalTip);
      int ans = (int)(finalTip);
      return ans;
    }
    public static void main(String[] args) {
        System.out.println(calculateTip(30d, "poor"));
    }
}