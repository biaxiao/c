package leetcode;

public class 求众数 {
    public int majorityElement(int[] nums) {
        int num=nums[0];
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if(count==0){
                num= nums[i];
                count++;
            }else {
                if(nums[i]==num){
                    count++;
                }else {
                    count--;
                }
            }
        }
        return num;
    }
}
