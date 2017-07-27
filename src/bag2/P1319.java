package bag2;

import java.util.Arrays;
import java.util.HashSet;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by c on 2017/7/24.
 */
public class P1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        for(int t = 0;  t < T; t++){
            String s;
            // input
            s = scanner.nextLine();
            String[] ss = s.split(" ");
            String[] s1 = ss[0].split("");
            String[] s2 = ss[1].split("");

            HashSet set1 = new HashSet();
            HashSet set2 = new HashSet();

            set1.addAll(Arrays.asList(s1));
            set2.addAll(Arrays.asList(s2));

            System.out.println();
            if(set1.equals(set2))
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}
