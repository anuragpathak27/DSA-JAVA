public class pallindrome {
    public static void main(String[] args) {
        int x = 1234321;
        int temp = x;
        int rev =0;
        while(temp>0){
            int digit = temp%10;
            rev  = (rev*10) + digit;
            temp /= 10;
        }
        if(rev == x) System.out.println(true);
        else System.out.println(false);
    }
}
