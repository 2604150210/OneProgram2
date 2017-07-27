package oj.ahstu.cc;

import java.util.Arrays;

/**
 * Created by c on 2017/7/24.
 */

public class ExceptionDemo {
    static class Tools {
        static boolean check(String[] ips) {
            for (String ip : ips)
                if (!check(ip))
                    return false;
            return true;
        }

        static boolean check(String s) {
            int n = 0;
            try {
                n = Integer.parseInt(s);
            } catch (Exception e) {
                return false;
            }
            return n >= 0 && n <= 255;

        }
    }

    public static void main(String[] args) {
        String ips[] = "1.1.1.1".split("\\.");
        System.out.println(Tools.check(ips));

    }


}
