package bag2;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by c on 2017/7/25.
 */
public class P1797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for(int i = 0; i < n; i++){
            int x = scanner.nextInt();
            if(!treeMap.containsKey(x)){
                treeMap.put(x, 0);
            }
            int v = treeMap.get(x);
            treeMap.put(x, v + 1);
        }
        for(Integer i : treeMap.keySet()){
            System.out.println(i + " " + treeMap.get(i));
        }
    }
}
