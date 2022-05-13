public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //test TwoSum
//        twoSumTest();

        //test RemoveDuplicates
//        removeDuplicatesTest();

        //maxProfit test
//        maxProfitTest();

        //rotate test
        rotateTest();
    }

    public static void twoSumTest() {
        //test TwoSum
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);
        System.out.println("result[0]:" + result[0] + " result[1]:" + result[1]);
    }

    public static void removeDuplicatesTest(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates solution = new RemoveDuplicates();
        int result = solution.removeDuplicates(nums);
        System.out.println(result);

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int result2 = solution.removeDuplicates2(nums2);
        System.out.println(result2);

    }


    public static void maxProfitTest(){
        int[] nums = {7,1,5,9,3,6,4,8};
        MaxProfit solution = new MaxProfit();
        int result = solution.maxProfit(nums);
        System.out.println(result);

    }

    public static void rotateTest(){
        int[] nums = {7,1,5,9,3,6,4,8};
        Rotate solution = new Rotate();
        solution.rotate(nums,3);
        System.out.println("rotate...");
    }
}