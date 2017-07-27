package bag2;

import sun.misc.Compare;

import java.util.*;

/**
 * Created by c on 2017/7/25.
 */
 class Node{
    private  int a, b, c;
    public Node(int aa, int bb, int cc){
        a= aa;
        b = bb;
        c = cc;
    }
    public int getA(){return a;}
    public int getB(){return b;}
    public int getC(){return c;}
}
public class P1429 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            Node[] nodes = new Node[n] ;
            for(int i = 0; i < n; i++ ){
                nodes[i]=new Node(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
            }
            int time = scanner.nextInt();
            int sum = 0;
            int s = 0;
            for(Node node : nodes){
                time -= node.getC();
                if(time < 0){
                    System.out.println("Oh,my god!");
                    break;

                }
            }

            if(time >=0)
            {
                Arrays.sort(nodes, new Comparator<Node>() {
                    @Override
                    public int compare(Node o1, Node o2) {
                        if(o1.getA() == o2.getA())
                            return o2.getC() - o1.getC();
                        return o1.getA() - o2.getA();
                    }
                });
                //if(n > 1)
                //System.out.println("nodes[0].getA(): " + nodes[0].getA() + "nodes[1].getA(): " + nodes[1].getA());
                for(int i = 0; i < n; i ++){
                    if(time + nodes[i].getC()>=nodes[i].getA() ){
                        time = time - nodes[i].getA() + nodes[i].getC();
                        sum ++;
                    }
                    else break;
                }
                System.out.println(sum);
            }

        }

    }
}
/*
3
1
3 2 1
1
2
3 2 1
3 2 1
4
2
3 2 1
3 2 1
1
* */