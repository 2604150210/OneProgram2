package oj.ahstu.cc;

import java.util.Stack;

/**
 * Created by c on 2017/7/24.
 */
public class ExpressionMatch {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<10;i++)
        stack.push((char)('a'+i));
        System.out.println(stack);
        for(Character c:stack)
            System.out.println(c);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+' ');
        }
    }
}
