package mutiThread;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ReviewEncourage {
     private static int n;
     public ReviewEncourage(int n) {
         this.n=n;
     } // 构造函�?n为中奖用户数
    //  PrizePool类仅有一个send方法，实现如下：
     public class PrizePool {
          public void send(String input) {
            System.out.print(input);
           }
     }
     public void bonus(PrizePool prizePool) {
         prizePool.send("A");
     }  // 仅能打印A，表示发放积�?/p>
     public void coupon(PrizePool prizePool) {
         prizePool.send("B");
     } // 仅能打印B，表示发放优惠券
     public void contribution(PrizePool prizePool) {
         prizePool.send("C");
     } // 仅能打印C，表示发放贡献�?/p>

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         int n= scanner.nextInt();
        ReviewEncourage reviewEncourage =new ReviewEncourage(n);
        ReviewEncourage.PrizePool prizePool = reviewEncourage.new PrizePool();
        //ExecutorService pool = Executors.newFixedThreadPool(3);
        ExecutorService pool = Executors.newScheduledThreadPool(3);
        boolean flag=true;
        for (int i=0;i< n;i++ ){
            if(i%2==0){
                pool.execute(()->{
                    reviewEncourage.bonus(prizePool);
                });
            }else{
                if(flag){
                    pool.execute(()->{
                        reviewEncourage.coupon(prizePool);
                    });
                    flag=false;
                }else{
                    pool.execute(()->{
                        reviewEncourage.contribution(prizePool);
                    });
                    flag=true;
                }
            }
        }
        pool.shutdown();
    }

}