package leetcode;

public class 盛最多水的容器No11 {
    public int maxArea(int[] height) {
        if (height==null || height.length<2) return 0;
        int res=0;
        int l=0;
        int r=height.length-1;
        int min=0;
        int len=0;
        while (l<r){
            len =r-l;
            if(height[l]<height[r]){
                min=height[l];
                l++;
            }else {
                min=height[r];
                r--;
            }
            res= Math.max(res, len*min);
        }
        return res;
    }
}
