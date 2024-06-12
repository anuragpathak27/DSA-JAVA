public class pascal_triangle {
    public static void main(String[] args) {
        int N = 5;
        for(int n = 0 ; n < N ; n++){
            int nCr = 1;
            for(int r = 0 ; r <= n ; r++){
                System.out.print(nCr + " ");
                nCr = (( n - r) * nCr) / (r + 1);
            }
            System.out.println();
    }
}
}
