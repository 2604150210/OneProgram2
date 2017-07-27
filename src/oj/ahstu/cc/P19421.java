package oj.ahstu.cc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by c on 2017/7/25.
 */
public class P19421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int a, b, c;
            int sum = 0;
            int [] arr = new int[n];
            for(int i = 0; i < n; i++){
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                sum += c;
                arr[i] = a - c;
            }
            int time = scanner.nextInt();
            if( time < sum ){
                System.out.println("Oh,my god!");
                continue;
            }
            Arrays.sort(arr);
            int s=0;
            for(int i = 0; i < arr.length; i++){
                if(sum + arr[i] <= time){
                    sum +=arr[i];
                    s++;
                }
                else break;
            }
            System.out.println(s);

        }
    }
}
