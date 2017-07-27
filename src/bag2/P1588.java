package bag2;

import java.util.Scanner;

/**
 * Created by c on 2017/7/26.
 */
public class P1588 {
    public static int [] a = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    public static int gets(int n){
        if(n==0)return a[0];
        int ret = 0;
        while(n!=0){
            ret += a[n%10];
            n /= 10;
        }
        return ret;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int sum = 0, com = 0;
            for(int i = 0;i <= 1111;i++){
                for(int j =0; j <= 1111;j++){
                    if(gets(i) + gets(j) + gets(i + j) == n-4 ){
                        //System.out.println(a + " " + b + " " + c);
                        //System.out.println("i:" + i + ",  j:" + j);
                        sum ++;
                        //if(i == j) com ++;
                    }

                }
            }
            //sum -= com;
            //System.out.println(com);

            System.out.println(sum);
    }
}
