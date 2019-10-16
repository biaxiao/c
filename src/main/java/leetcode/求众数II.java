package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 求众数II {
    public static void main(String[] args) {
        int [] nums =new int[] {1,1,1,3,3,2,2,2};
        majorityElement(nums);
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list =new ArrayList<>();
        if(nums==null||nums.length<1) return list;
        int cA=nums[0];
        int cB= nums[0];
        int countA=0;
        int countB=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==cA){
                countA++;
            }else if (nums[i]==cB){
                countB++;
            }else if(countA==0) {
                cA=nums[i];
                countA++;
            }else if(countB==0){
                cB=nums[i];
                countB++;
            }else {
                countA--;
                countB--;
            }
        }

        int cAc=0;
        int cBc=0;
        for (int num : nums) {
            if(num==cA){
                cAc++;
            }else if(num==cB){
                cBc++;
            }
        }

        int len =nums.length/3;
        if(cAc>len){
            list.add(cA);
        }
        if (cBc>len){
            list.add(cB);
        }
        return list;
    }
}
