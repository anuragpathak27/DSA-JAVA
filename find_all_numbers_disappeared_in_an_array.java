import java.util.ArrayList;
import java.util.List;

public class find_all_numbers_disappeared_in_an_array {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

         List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;

            if(nums[index]>0) nums[index] *= -1;
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]>0) list.add(i+1);
        }
        System.out.println(list);
    }
}
