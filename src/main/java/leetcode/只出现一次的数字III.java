package leetcode;

public class 只出现一次的数字III {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,1,3,2,5};
        singleNumber(arr);
    }
    public static int[] singleNumber(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum^=nums[i];
        }
        int count=0;
        for (int i = 0; i < 32; i++) {
            if((sum&1)==1){
                count=i;
                break;
            }else{
                sum=sum>>1;
            }
        }

        int sum1=0;
        int sum2=0;
        for (int i = 0; i < nums.length ; i++) {
            if(((nums[i]>>count)&1)==1){
                sum1^=nums[i];
            }else {
                sum2^=nums[i];
            }
        }
        return new int[]{sum1,sum2};
    }
}
