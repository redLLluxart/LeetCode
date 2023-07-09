package Problem;

import java.util.HashSet;
import java.util.Set;

public class Task137 {
    public static int singleNumber(int[] nums) {
        int result = 0;
        Set<Integer> temp = new HashSet<>();
        for (int num:nums){
            temp.add(num);
        }
        for (int num : temp){
            int count = 0;
            for(int i : nums){
                if(i == num){
                    count++;
                }
            }
            if(count==1){
                result = num;
            }
        }
        return result;
    }
}
