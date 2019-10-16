package mutiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WineDecanter {
    static int num;
    static List<Integer> list = new ArrayList<>();
    public WineDecanter(int num){
        this.num=num;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(",");
        String s1 = sc.nextLine();
        num=Integer.parseInt(s1);
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(get(Integer.parseInt(split[i])));
            sb.append(",");
        }
        System.out.println(sb.toString().substring(0,sb.length()-1));
    }


    public static int get(int n){
        if(list.contains(n)){
            list.remove((Object)n);
            list.add(n);
            return n;
        }else{
            if(list.size()==num){
                list.remove(0);
            }
            list.add(n);
            return -1;
        }
    }
}
