package bag2;



import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by c on 2017/7/26.
 */
public class P1964 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[10];
        for(int i = 0; i < 10; i ++){
            a[i] = fact(i);
        }
        System.out.println(Arrays.toString(a));
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int i = 9;
            while (i > 0){
                if(n >= a[i])
                    n -= a[i];
                i--;

            }
            if(n == 0)
                System.out.println("Yes");
            else System.out.println("No");
        }
    }

    private static int fact(int n) {
        if(n == 1||n==0)return 1;
        return n * fact(n-1);
    }
}
