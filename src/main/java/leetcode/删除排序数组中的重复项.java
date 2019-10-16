package leetcode;

public class 删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int slowP=0;
        for (int fastP = 0; fastP < nums.length; fastP++) {
            if(nums[fastP]!=nums[slowP]){
                slowP++;
                nums[slowP]=nums[fastP];
            }
        }
        return slowP+1;
    }
}
