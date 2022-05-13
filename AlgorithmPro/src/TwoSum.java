import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            hash.put(target-nums[i], i);
        }
        return indexs;
    }
}
