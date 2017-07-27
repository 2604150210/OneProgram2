package bag2;

import java.util.*;

/**
 * Created by c on 2017/7/25.
 */
public class P1582 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        String[] qq = s.split(" ");
        Queue<String> que = new LinkedList<>();
        que.addAll(Arrays.asList(qq));
        Stack<String> stack = new Stack<String>();
        stack.push(que.poll());
        while(!que.isEmpty()){
            que.add(que.poll());
            stack.push(que.poll());
        }
        for(String string : stack){
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
