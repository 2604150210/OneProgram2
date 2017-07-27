package bag2;

import java.util.*;

/**
 * Created by c on 2017/7/25.
 */
public class P1543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for(int i = 0; i < n; i++){
                arrayList.add(scanner.nextInt());
                treeSet.add(arrayList.get(i));
            }
            int num = 1;
            for(Integer i : treeSet){
                treeMap.put(i, num++);
            }
            int k = 0;
            System.out.print(treeMap.get(arrayList.get(k)));

            for(k = 1; k < arrayList.size(); k++){
                System.out.print(" " + treeMap.get(arrayList.get(k)));
            }
            System.out.println();
        }
    }
}
