package bag2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by c on 2017/7/25.
 */
public class P1739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] ids = new String[n];

        for(int i = 0; i < n; i ++){
            ids[i] = scanner.nextLine();
        }
        Arrays.asList(ids);
        Arrays.sort(ids, new Comparator<String>() {
            @Override
            public int compare(String o2, String o1) {
                if(o1.substring(6, 14).equals(o2.substring(6, 14)) )
                    return o1.compareTo(o2);
                else
                    return o1.substring(6, 14).compareTo(o2.substring(6, 14));
            }
        });
        for(int i = 0; i < n; i++ ){
            System.out.println(ids[i]);
        }


    }
}
/*
5
466272307503271156
215856472207097978
234804580401078365
404475727700034980
710351408803093165

404475727700034980
234804580401078365
215856472207097978
710351408803093165
466272307503271156
* */