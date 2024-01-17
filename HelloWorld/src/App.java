public class App {
    public static String rps(String p1, String p2) {
        String result = "";
        if (p1 == p2){
            result = "Draw!";
        }
        else if ((p1 == "paper" && p2 == "rock") || (p1 == "rock" && p2 == "scissors") || (p1 == "scissors" && p2 == "paper")) {
            result = "Player 1 won!";
        }
        else {
            result = "Player 2 won!";
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(rps("paper", "rock"));
    }
}