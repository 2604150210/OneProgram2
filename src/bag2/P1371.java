package bag2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by c on 2017/7/26.
 */
public class P1371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            Integer n = scanner.nextInt();
            int k = scanner.nextInt();
            int ws = w(n);
            int [] a = new int[ws];
            int i = ws;
            while(n > 0){
                a[--i] = n%10;
                n /= 10;
            }
            for(i = 0; i < k; i++){
                int max = 0;
                for(int j = 0; j < ws; j++){
                    if(a[j] > a[max] ){
                        max = j ;
                    }
                }
                a[max] = -1;
                            }
            for(i = 0; i < ws; i++){
                if(a[i] != -1)
                    System.out.print(a[i]);
            }

    }

    private static int w(Integer n) {
        int ret = 0;
        while(n > 0){
            ret++;
            n /= 10;
        }
        return ret;
    }
}
