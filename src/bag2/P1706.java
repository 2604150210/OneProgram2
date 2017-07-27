package bag2;

import java.util.Scanner;

/**
 * Created by c on 2017/7/25.
 */
public class P1706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");
        int maxlen = 0;
        String temp = null;
        for(String word : ss){
            if(maxlen < word.length()){
                maxlen = word.length();
                temp = word;
            }

        }
        System.out.println(temp);
    }
}
