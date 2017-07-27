package bag2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by c on 2017/7/24.
 */
class Check{
    public static boolean check(String[] s){
        for(String i : s){
            if(!check(i))
                return false;
        }
        return true;
    }

    public static boolean check(String s){
        int n = 0;
        try{
            n = Integer.valueOf(s);
        }catch (Exception e){
            return false;
        }
        return n<=225&&n>=0;
    }
}
public class P1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] word = s.split("\\.");
            //System.out.println(Arrays.toString(word));
            if(Check.check(word))
                System.out.println("Y");
            else
                System.out.println("N");
        }
        scanner.close();
    }
}
