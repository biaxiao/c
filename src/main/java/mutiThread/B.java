package mutiThread;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=0;
        if(sc.hasNextInt()){
            n=sc.nextInt();
        }
        int[] arr =new int[n];
        for (int i = 0; i <n ; i++) {
            if(sc.hasNextInt()){
                arr[i]=sc.nextInt();
            }
        }
        sort(n, arr);
    }

    public static void sort(int n,int[] arr){
        int min=arr[0];
        int max=arr[1];
        for (int i = 0; i < n; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int[] tmp =new int[max-min+1];
        for (int i = 0; i < n; i++) {
            tmp[arr[i]-min]++;
        }

        int c=1;
        int t=1;
        while(t<=n){
            for (int i = 0; i < tmp.length; i++) {
                if(tmp[i]==c){
                    int temp=c;
                    while(temp-->0){
                        System.out.println(i+min);
                    }
                    t+=c;
                }
            }
            c++;
        }
    }
}
