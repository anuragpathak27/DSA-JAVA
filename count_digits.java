public class count_digits {
    public static void main(String[] args) {
        int n = 736724232;
        int digits = (int) ( Math.log(n) / Math.log(10) ) + 1;
        System.out.println(digits);
    }
}
