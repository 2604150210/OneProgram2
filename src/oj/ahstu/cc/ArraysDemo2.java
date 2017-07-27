package oj.ahstu.cc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by c on 2017/7/24.
 */
public class ArraysDemo2 {
    public static void main(String[] args) {
        Integer a[]={1,3,5,7,9,2,4,6,8,0,11};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

        Arrays.sort(a,new Comparator<Integer>(){

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
        System.out.println(Arrays.toString(a));
    }
}
