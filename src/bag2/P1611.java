package bag2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by c on 2017/7/24.
 */
public class P1611 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <= n; i++){
            BigInteger cur = BigInteger.valueOf(i);
            fact = fact.multiply(cur);
        }
        System.out.println(fact);
    }

}
