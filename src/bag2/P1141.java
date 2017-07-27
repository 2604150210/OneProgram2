package bag2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by c on 2017/7/24.
 */
public class P1141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if(n==0)break;
            TreeSet<Integer> treeSet = new TreeSet<>();
            for(int i = 0; i < n; i++){
                Integer x = scanner.nextInt();
                treeSet.add(x);
            }
            System.out.println(treeSet.size());
            Iterator it = treeSet.iterator();
            System.out.print(it.next());
            while(it.hasNext()){
                System.out.print(" " + it.next());
            }
            System.out.println();
        }
    }
}
