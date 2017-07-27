package oj.ahstu.cc;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by c on 2017/7/24.
 */
public class SetDemo {
    public static void main(String[] args) {
        String ss[]="aabbcc".split("");
        String ss2[]="cba".split("");
        HashSet<String>  set1=new HashSet<String>();
        set1.addAll(Arrays.asList(ss));
        System.out.println(set1);
        HashSet<String>  set2=new HashSet<String>();
        set2.addAll(Arrays.asList(ss2));
        System.out.println(set2);
       // System.out.println(Arrays.toString(ss));
       // System.out.println(Arrays.toString(ss2));
        System.out.println(set1.equals(set2));
    }
}
