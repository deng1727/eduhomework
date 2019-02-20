package singleton;

import java.util.ArrayList;
import java.util.List;

public class Triple {
    private int number ;
    private static List<Triple> lists = new ArrayList<Triple>(3);
    private Triple(int number){
        this.number= number;
    }
    public static  Triple getInstance(int id){
        init();
        return lists.get(id);
    }
    private static void init(){
        for (int i = 0 ;i<3 ;i++
             ) {
            lists.add(new Triple(i));
        }
    }
    public int toInt(){
        System.out.println("这一个对象的编号是："+number);
        return number;
    }
}
