package oj.ahstu.cc;

import java.math.BigDecimal;

/**
 * Created by c on 2017/7/24.
 */
public class BDDemo {
    public static void main(String[] args) {
        int a=3,b=7,c=100;
        BigDecimal ba=new BigDecimal(Integer.toString(a));
        BigDecimal bb=new BigDecimal(Integer.toString(b));
        BigDecimal bc=ba.divide(bb,c,BigDecimal.ROUND_UP);
        System.out.println(bc);
    }
}
