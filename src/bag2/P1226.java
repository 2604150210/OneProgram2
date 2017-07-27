package bag2;

import java.util.Scanner;

/**
 * Created by c on 2017/7/24.
 */
public class P1226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String article = scanner.nextLine();
            String[] word = article.replaceAll("//W+", " ").split(" ");

            System.out.print(change(word[0]));
            for(int i = 1; i < word.length; i++){
                System.out.print(" " + change(word[i]));
            }
            System.out.println();

        }
    }

    private static String change(String  i){
        return i.replaceFirst(i.substring(0, 1), i.substring(0, 1).toUpperCase());
    }
}
