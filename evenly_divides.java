public class evenly_divides {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(evenlyDivides(n));
    }
    static int evenlyDivides(int N){
        int count = 0;
        int n = N;
        while(n > 0){
            int digit = n % 10;
            if(digit != 0 && N % digit == 0){
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
