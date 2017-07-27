package bag;

/**
 * Created by c on 2017/7/23.
 */

class C {
    private int a = 1;
    private int b = 5;
    public void m1(){
        int i = 4, j = 5;
        a = i + j;
    }
    public void m2(int i){
        int j = 8;
        a = i + j;
        System.out.println(a);
    }
}
public class TestVariable {

    public static void main(String[] args) {

        C c = new C();
        c.m1();
        int k = 4;
        c.m2(k);
    }
}
