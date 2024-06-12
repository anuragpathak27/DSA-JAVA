public class reverse_integer {
    public static void main(String[] args) {
    
        int x = -321;
        int reverse = 0;
        int temp;

        while (x != 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
               System.out.println(0);
            }
        }

        System.out.println(reverse);
}
}