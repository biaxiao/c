package leetcode;

public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mP=m-1;
        int nP=n-1;
        for(int curP=m+n-1;curP>=0;curP--){
            if(mP<0){
                nums1[curP]=nums2[nP--];
            }else if (nP<0){
                nums1[curP]=nums1[mP--];
            }else if(nums1[mP]>nums2[nP]){
                nums1[curP]=nums1[mP--];
            }else {
                nums1[curP]=nums2[nP--];
            }
        }
    }
}
