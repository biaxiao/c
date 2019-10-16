import java.util.concurrent.ArrayBlockingQueue;

public  class App {
    public static void main(String[] args) {
        int[] arr =new int[]{4,1,2,5,3,6};
        //modifyCount(5,arr);
        //System.out.println(1>>-1);
        //System.out.println(2>>-2);
        //System.out.println(1<<-2);
        System.out.println(((int)'0'));
    }

    public static void modifyCount(int n,int[] arr){
        int minIndex=0;
        int maxIndex=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }

        int count=1;
        for (int i = minIndex+1; i < arr.length ; i++) {
            if(arr[i]>arr[minIndex]){
                count++;
                minIndex=i;
            }
        }
        int m= maxIndex==arr.length-1?1:0;
        int r1= arr.length - count +1;
        System.out.println(Math.min(r1 , count));
    }

}
