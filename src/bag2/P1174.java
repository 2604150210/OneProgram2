package bag2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by c on 2017/7/26.
 */
public class P1174 {
    static class Node implements Comparable<Node>  {

       private int x,y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node o) {
            return this.y - o.y;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            Node[] nodes = new Node[n];
            for(int i = 0; i < n; i ++ ){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                nodes[i] = new Node(a, b);
            }
            Arrays.sort(nodes);
            int [] a = new int[n];
            int s = 0;
            int t = n;
            while(t > 0) {
                int time = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == 0 && time <= nodes[i].getX()) {
                        time = nodes[i].getY();
                        a[i] = 1;
                        t--;
                    }
                }
                s ++;
            }
            System.out.println(s);
        }
    }
}
