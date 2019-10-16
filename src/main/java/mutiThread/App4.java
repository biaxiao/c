package mutiThread;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

//interface A0{
//    void m() throws CloneNotSupportedException ,IOException;
//}
//interface A1{
//    void m() throws SQLException,IOException;
//}
//interface A3 extends A0,A1{
//    //void m() throws IOException,SQLException;
//}
public class App4 {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<>(0);
        for (int i = 0; i < 7; i++) {
            list.add(i);
            list.remove((Object) (i - 1));
        }
        System.out.println(list);*/


        /*String[] s =new String[]{"1","2"};
        List list = Arrays.asList(s);
        //list.clear();
        //list.add(3);
        System.out.println(list.toString());*/

        Map map = new LinkedHashMap(1, 0.75f, true);
        map.put(1,1);
        map.put(2,1);
        map.put(1,2);
        System.out.println(map.size());

    }

}
