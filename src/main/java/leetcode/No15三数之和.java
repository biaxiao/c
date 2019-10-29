package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class No15三数之和 {
    @Test
   public void test(){
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        threeSum(arr);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists =new ArrayList<>();
        if(nums==null|| nums.length<3) return lists;
        int len = nums.length;
        quickSort(nums, 0, len-1);
        for (int i = 0; i < len; i++) {
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left=i+1, right=len-1;
            while (left<right){
                if(nums[left]+nums[right]==-nums[i]){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    lists.add(list);
                    while (left<right && nums[left]==nums[left+1]) left++;
                    while (left<right && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }else if(nums[left]+nums[right]<-nums[i]){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return lists;
    }

    public void quickSort(int[] arr, int left ,int right){
        if(left<right){
            int l=left, r=right, x=arr[left];
            while(l<r){
                while(l<r &&arr[r]>=x){
                    r--;
                }
                if(l<r){
                    arr[l++]=arr[r];
                }
                while (l<r && arr[l]<=x){
                    l++;
                }
                if(l<r){
                    arr[r--]=arr[l];
                }
            }
            arr[l]=x;
            quickSort(arr, left, l-1);
            quickSort(arr, l+1, right);
        }
    }
}
