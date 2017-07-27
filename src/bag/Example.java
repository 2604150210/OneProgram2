package bag;

import java.util.*;
/**
 * Created by c on 2017/7/23.
 */

public class Example {

    public static void main(String[] args) {

        Example ex = new Example();
        int date = 9;
        ex.change1(date);

        Mydate d1 = new Mydate(7, 7, 1970);
        ex.change2(d1);
        Mydate d2 = new Mydate(1, 1, 2000);
        ex.change3(d2);

        System.out.println(date);
        d1.display();
        d2.display();
    }

    public void change1(int i){
        i = 1234;
    }

    public void change2(Mydate b){
        b = new Mydate(22, 2, 2004);
    }

    public void change3(Mydate b){
        b.setDay(22);
    }
}
