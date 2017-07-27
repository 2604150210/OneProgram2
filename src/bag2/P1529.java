package bag2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by c on 2017/7/25.
 */
public class P1529 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String[] ss = s.split(" ");
            String N = ss[0] ;
            int k = Integer.parseInt(ss[1]);
            char [] n = N.toCharArray();
            int k1 = k;
            int head = 0;
            while(k1 > 0){
                int i;
                char max = n[head];
                int maxi = head;
                for(i = head; i <= head + k1&& i < n.length; i++){
                    if(n[i] > max ) {
                        max = n[i];
                        maxi = i;
                    }
                }
                for( i = maxi; i > head; i--){
                    n[i] = n[i -1];
                }
                n[head] = max;

                k1 -= (maxi - head);
                head ++;
                if(head >= n.length)
                    break;
            }
            for(int i = 0; i < n.length; i++)
                System.out.print(n[i]);
            System.out.println();
        }
    }
}
