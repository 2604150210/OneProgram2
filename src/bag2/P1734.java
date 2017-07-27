package bag2;

import java.util.*;

/**
 * Created by c on 2017/7/26.
 */
public class P1734 {
    public static int maxn = 32768;
    public static int[] prime = new int[maxn];
    public static int[] f =new int[maxn];
    public static void getp(){
        for(int i = 2; i < maxn; i++){
            if(prime[i] == 0)
            for(int j = i*i; j < maxn; j +=i){
                prime[j]=1;
            }
        }
        int k=0;
        for(int i = 2; i < maxn; i++){
            if(prime[i] == 0){
                f[k++]=i;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        getp();
        int n = scanner.nextInt();
        int n1 = n;
        Queue<Integer> que = new LinkedList<Integer>();
        int k = 0;
        while(n!=1){
            if(n % f[k] == 0) {
                que.add(f[k]);
                n /= f[k];
            }
            else k++;
        }
        System.out.print(n1 + "=" + que.remove());
        for(Integer i:que)
            System.out.print("*" + i);
        System.out.println();
    }
}
