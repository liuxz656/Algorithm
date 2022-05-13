public class Rotate {
    public void rotate(int[] nums, int k){
        int length = nums.length;
        int[] temp = new int[length];
        //把原数组值放到一个临时数组中
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        //然后在把临时数组的值重新放到原数组，并且往右移动k位
        for (int i = 0; i < length; i++) {
            nums[ (i + k) % length ] = temp[i];
        }
    }
}
