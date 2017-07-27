package bag;
import java.util.*;
/**
 * Created by c on 2017/7/15.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int a[] = new int[50];
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for(int i = 3; i <= 20; i++)
            a[i] = a[i-1] + a[i-2];
        for(int i = 1; i <= 20 ;i++)
            System.out.print(a[i] + " ");
    }
}
