package bag;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by c on 2017/7/16.
 */

public class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer [] a = new Integer [rand.nextInt(20)];
        System.out.println(a.length);
        for(int i = 0 ; i < a.length ; i++)
            a[i] = rand.nextInt(300);
        System.out.println(Arrays.toString(a));
    }
}
