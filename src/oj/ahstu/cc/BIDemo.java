package oj.ahstu.cc;

import java.math.BigInteger;

/**
 * Created by c on 2017/7/24.
 */
public class BIDemo {
    public static void main(String[] args) {
        BigInteger factorial= BigInteger.ONE;
        for(int i=2;i<=50;i++){
            BigInteger cur=new BigInteger(Integer.toString(i));
            factorial=factorial.multiply(cur);
        }
        System.out.println(factorial);
    }
}
