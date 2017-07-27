package bag;

import java.util.Arrays;

/**
 * Created by c on 2017/7/23.
 */
public class TestArray2 {
    public static void main(String[] args) {
        int src[] = {1, 2, 3, 4, 5, 6};
        int dest[] ={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] a = {34, 32, 23, 1, 3435, 53, 2324, 43,2324,45,767,687,56};
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.arraycopy(src, 3, dest, 4, 3);
        for(int i = 0; i < dest.length; i++){
            System.out.print(dest[i] +  " ");
        }
    }
}
