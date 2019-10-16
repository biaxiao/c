package leetcode;

public class 移动零 {
    public void moveZeroes(int[] nums) {
        int index=0;
        for (int k = 0; k < nums.length; k++) {
            if(nums[k]!=0){
                nums[index++]=nums[k];
            }
        }

        for (int i =index; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
