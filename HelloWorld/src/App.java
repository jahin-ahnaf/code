public class App {
  public static boolean validatePin(String pin) {
    // Your code here...
    boolean result = false;
    if ((pin.length() == 4) || (pin.length() == 6)){
      result = true;
    }
    for (int i = 0; i < pin.length(); i++){
      if (!Character.isDigit(pin.charAt(i))){
        result = false;
      }
    }
    return result;
  }
public static void main(String[] args){
  
}
}