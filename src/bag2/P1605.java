package bag2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by c on 2017/7/24.
 */
public class P1605 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            String s = scanner.nextLine();
            char[] c = s.toCharArray();

            int len = n-1;
            int cns = 0, p = 0;//记录交换的次数
            int flag = 0;//标记奇数元素的个数
            for(int i = 0; i < len; i++){
                for(int j = len; j >= 0; j--){
                    if(j == i){
                        flag ++;
                        if(n % 2 == 0 || flag > 1 ){
                            System.out.println("Impossible");
                            return ;
                        }
                        p = n/2 - i;
                        break;
                    }
                    else if(c[j] == c[i]){
                        cns += len - j;
                        int k;
                        for( k = j; k <len; k++){
                            c[k] = c[k +1 ];
                        }
                        c[len] = c[i];
                        len -- ;
                        break;
                    }
                }
            }
            System.out.println(p+cns);
        }

}
