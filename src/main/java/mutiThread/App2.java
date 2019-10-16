package mutiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App2 {
    private static int count=0;
    private static List<String> list =new ArrayList<String>();
    private static boolean flag=false;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(",");
        count=split.length;
        preOrder(split,0);
        if(flag){
            System.out.println("null");
        }else {
            list.stream().forEach(System.out::print);
        }
    }

    public static void preOrder(String[] split ,int index){
        if(index>=count){
            return;
        }
        if(split[index].equals("null")){
            if(index==0||(index*2+1<count&&split[index*2+1].equals("null"))||(index*2+2<count&&split[index*2+2].equals("null"))){
                flag=true;
            }
            return;
        }
        int left=index*2+1;
        int right=index*2+2;
        list.add(split[index]);
        preOrder(split,left);
        preOrder(split,right);
    }
}
