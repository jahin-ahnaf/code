public class App {
    public String toJadenCase(String phrase) {
        String mew = "";
		if (phrase.length() > 0) {
            String[] bruh = phrase.split("");
            int i = 0;
            while (i < phrase.length()) {
                bruh[0] = bruh[0].toUpperCase();
                if (bruh[i].isEmpty()){
                    bruh[i + 1] = bruh[i + 1].toUpperCase();
                }
                mew = mew + bruh[i];
                i++;
            }
            return mew;
        }
		return null;
	}
    public static void main(String[] args) {
        App jadencase = new App();
        System.out.println(jadencase.toJadenCase("hello world"));
    }
}