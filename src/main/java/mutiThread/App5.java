package mutiThread;

import java.util.Arrays;

public class App5 {
    Runnable r = () -> {
        System.out.println("11");
    };

    public static void main(String[] args) {
        getSum(-10, -7);
    }

    private static void getSum(int a, int b){
        int sum;
        int carry;
        do {
            sum=a^b;
            carry=(a&b)<<1;
            a=sum;
            b=carry;
        }while (b!=0);
        System.out.println(sum);
    }
}
