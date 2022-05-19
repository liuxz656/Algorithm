
//https://satin-piper-4c1.notion.site/6-II-062bfd0fc63e430fbbf9e0b2dadd4785

import java.sql.Array;
import java.util.Arrays;

//两个数组的交集 II
public class Intersect {
    //给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
    public int[] intersect (int[] nums1, int[] nums2){
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 < len2 ? len1 : len2;
        int ans[] = new int[len];
        if (len1 == 0 || len2 == 0) return ans;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2){
            if (nums1[i] == nums2[j]){
                ans[k] = nums1[i];
                i++;
                j++;
                k++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}
