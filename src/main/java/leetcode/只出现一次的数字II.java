package leetcode;

public class 只出现一次的数字II {
    public int singleNumber(int[] nums) {
        int[] bit =new int[32];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < 32; j++) {
                bit[j]+=(nums[i]&1);
                nums[i]=nums[i]>>1;
            }
        }
        int result=0;
        for (int i = 31; i >=0; i--) {
            result=result<<1;
            result+=(bit[i]%3);
        }
        return result;
    }
}
