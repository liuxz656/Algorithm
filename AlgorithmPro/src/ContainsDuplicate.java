
//4.存在重复元素
//https://satin-piper-4c1.notion.site/4-deeaea0b01e84909b14f74e31ad61cc6

import java.util.*;

//给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
public class ContainsDuplicate {
    //先排序 然后判断两个相邻的数字是否相等
    public boolean containsDuplicateSort(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateSet(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums){
            //因为集合set中不能有重复的元素，如果有重复的
            //元素添加，就会添加失败
            if (!set.add(num)) return true;
        }
        return false;
    }
}
