import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = null;
        if(sc.hasNextLine()){
            line1= sc.nextLine();
        }
        String[] s1 = line1.split(" ");

        String line2 = null;
        if(sc.hasNextLine()){
            line2= sc.nextLine();
        }
        String[] s2 = line2.split(" ");

        String line3 = null;
        if(sc.hasNextLine()){
            line3= sc.nextLine();
        }
        String[] s3 = line3.split(" ");

    }

    public static void getD(int n, int cost, int total, String[] arr ,String[] brr ){
        int num=0;
        int i=0;
        int j=0;
        if(getLen(brr,0,arr[i])> getLen(arr,0,brr[i])){

        }
    }

    public static int getLen(String[] arr, int start, String target){
        for (int i = start; i < arr.length; i++) {
            if(arr[i] == target){
                return i-start+1;
            }
        }
        return -1;
    }
}
