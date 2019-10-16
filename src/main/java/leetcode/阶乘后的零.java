package leetcode;

public class 阶乘后的零 {
    public int trailingZeroes(int n) {
        int m=1;
        int sum=0;
        while (Math.pow(5, m)<=n){
            sum+=n/Math.pow(5, m);
            m++;
        }
        return sum;
    }
}
