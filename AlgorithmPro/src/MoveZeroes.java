//8.移动零
//https://satin-piper-4c1.notion.site/8-04f528e057ae4853a33cf8e07c35f8f5

public class MoveZeroes {

//    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//    请注意 ，必须在不复制数组的情况下原地对数组进行操作。

//    1，把非0的往前挪
//    把非0的往前挪，挪完之后，后面的就都是0了，然后在用0覆盖后面的。
    public void moveZeroes(int[] nums){
        if (nums == null || nums.length == 0) return;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[index++] = nums[i];
        }
        while (index < nums.length){
            nums[index++] = 0;
        }
    }

    //2，参照双指针解决
    //这里可以参照双指针的思路解决，指针j是一直往后移动的，如果指向的值不等于0才对他进行操作。
    // 而i统计的是前面0的个数，我们可以把j-i看做另一个指针，它是指向前面第一个0的位置，然后我们让j指向的值和j-i指向的值交换
    public void moveZeroes2(int[] nums){
        if (nums == null || nums.length == 0) return;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
        }
    }

}
