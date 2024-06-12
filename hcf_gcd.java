public class hcf_gcd {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0) System.out.println(b);
        System.out.println(a);
    }
}
