public class largest_element {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,8,7};

        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }

        System.out.println(max);
    }
}