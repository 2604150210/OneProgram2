package oj.ahstu.cc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;


/**
 * Created by c on 2017/7/24.
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();

        for(int i=0;i<10;i++)
            v.add((int)(Math.random()*100));
        System.out.println(v);
        Collections.sort(v, Collections.reverseOrder());
        System.out.println(v);

        Collections.sort(v,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
               // return o1-o2;//Increasing
               // return o2-o1;//Decreasing
                int hash1=ff(o1);
                int hash2=ff(o2);
                return hash1-hash2;
            }
            private int ff(Integer n) {
                if(n<10)
                    return n;
                return ff(n/10)+(n%10);
            }
        });
        System.out.println(v);
    }
}
