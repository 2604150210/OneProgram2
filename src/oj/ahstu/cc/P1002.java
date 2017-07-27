package oj.ahstu.cc;

import java.util.Scanner;

public class P1002 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        int b=cin.nextInt();
        int c=cin.nextInt();

        cin.close();
        double delta=Math.sqrt(b*b-4*a*c);
        double x1=(-b+delta)/(2*a);
        double x2=(-b-delta)/(2*a);
        System.out.println(String.format("%.3f %.3f\n",x1,x2));
    }
}
