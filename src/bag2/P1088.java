package bag2;

import java.util.Scanner;

/**
 * Created by c on 2017/7/26.
 */
public class P1088 {
    static int []a = {100, 50, 10, 5, 2, 1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if(n == 0)break;
            int s = 0;
            for(int i = 0; i < n; i++){
                int x = scanner.nextInt();
                s+=gexSalary(x);
            }
            System.out.println(s);
        }
    }
    private static int gexSalary(int x) {
        int ret = 0;
        int i =0;
        while(x > 0){
            ret+=x/a[i];
            x = x%a[i];
            i++;
        }
        return ret;
    }
}
