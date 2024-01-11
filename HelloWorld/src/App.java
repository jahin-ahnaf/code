public class App {
    public static int digital_root(int n) {
        int sum = 0;
        char[] a = String.valueOf(n).toCharArray();

        int[] newArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = Integer.parseInt(String.valueOf(a[i]));
            sum += newArray[i];
        }
        String sumString = String.valueOf(sum).toString(); //29
        if (sumString.length() > 1){
        while (sumString.length() > 1){
            sum = 0;
            char[] sumChar = String.valueOf(sumString).toCharArray();
            int[] sumInt = new int[sumChar.length];
            for (int i = 0; i < sumInt.length; i++){
                sum += sumInt[i];
            }
        }
    }
        System.out.println(sum);
        return n;
    }
    public static void main(String[] args) throws Exception {
        digital_root(493193);
    }
}
