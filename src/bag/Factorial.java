package bag;

/**
 * Created by c on 2017/7/23.
 */
public class Factorial {
    public int f(int n){
        if(n == 1)
            return 1;
        return f(n-1) * n;
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.f(5));
    }
}
