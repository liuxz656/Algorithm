//1.删除排序数组中的重复项
//https://satin-piper-4c1.notion.site/1-ba7c1518ef164c0187cc5fc00e5aa71a

public class RemoveDuplicates {

    //nums 是一个升序的数组
    public int removeDuplicates(int[] nums){
        //边界条件判断
        if (nums == null || nums.length == 0) return 0;
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            //如果左指针和右指针的值一样 说明有重复，左指针不动，右指针继续往右边移动
            //假如指向的值不一样，就把右指针指向的值往前移动
            if (nums[left] != nums[right]) nums[++left] = nums[right];
        }
        return ++left;
    }

    public int removeDuplicates2(int[] nums){
        //重复元素的个数
        int count = 0;
        if (nums == null || nums.length == 1) return count;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == nums[right - 1]){
                count++;
            }else {
                nums[right - count] = nums[right];
            }
        }
        return nums.length - count;
    }
}
