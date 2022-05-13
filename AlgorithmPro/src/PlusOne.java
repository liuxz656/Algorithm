public class PlusOne {
    //给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
    //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    //你可以假设除了整数 0 之外，这个整数不会以零开头。

    public int[] plusOne(int[] digits) {
//        如果数组中的所有元素都是9，类似9999，加1之后肯定会变为10000，也就是数组长度会增加1位。
//        如果数组的元素只要有一个不是9，加1之后直接返回即可。
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int temp[] = new int[length + 1];
        temp[0] = 1;
        return temp;
    }
}
