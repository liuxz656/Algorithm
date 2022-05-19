//9.两数之和
//https://satin-piper-4c1.notion.site/9-e93abd1df2d748ca853597da64fcc7d8

import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            if (hash.get(target - nums[i]) != null){
                indexs[0] = hash.get(target - nums[i]);
                indexs[1] = i;
                return indexs;
            }
            hash.put(nums[i], i);
        }
        return indexs;
    }
}
