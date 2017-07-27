package bag2;

import java.util.*;

/**
 * Created by c on 2017/7/25.
 */
public class P1658 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split("\\s+");
        HashSet<String> hs = new HashSet();
        hs.addAll(Arrays.asList(ss));
        System.out.println(hs.size());
    }
}
