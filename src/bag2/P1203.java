package bag2;

import java.util.Scanner;

/**
 * Created by c on 2017/7/24.
 */
public class P1203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String porse = scanner.nextLine();
        String[] word = porse.replaceAll("\\W+", " ").split(" ");
        for(String i : word){
            System.out.println(i);
        }

    }
}
