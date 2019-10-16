package leetcode;

public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum^=nums[i];
        }
        return sum;
    }
}
