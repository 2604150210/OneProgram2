package bag2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by c on 2017/7/24.
 */
public class P1115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeMap<String, Integer>map = new TreeMap<>();
        for(int i = 1; i <= n; i++){
            String num = Integer.toString(Integer.valueOf(i));
            String[] c = num.split("");

            c = Arrays.copyOfRange(c, 1, c.length);
            for(String j : c) {
                if(map.containsKey(j)){
                    int perv = map.get(j);
                    map.put(j, perv + 1);
                }
                else map.put(j, 1);
            }
        }
        for(String c : map.keySet()){
            System.out.println(map.get(c));
        }
    }
}
