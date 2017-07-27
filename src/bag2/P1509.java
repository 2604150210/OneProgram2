package bag2;

import java.util.Scanner;

/**
 * Created by c on 2017/7/26.
 */
public class P1509 {

    public static final int MINE = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col, k;
        while (scanner.hasNext()) {
            row = scanner.nextInt();
            col = scanner.nextInt();
            int[][] a = new int[row][col];
            k = scanner.nextInt();
            for (int i = 0; i < k; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                a[x][y] = MINE;
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (a[i][j] == MINE)
                        continue;
                    a[i][j] = count8(a, i, j);

                }
            }
            dispArray(row, col, a);
            System.out.println();
        }
    }

    private static void dispArray(int row, int col, int[][] a) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == MINE)
                    System.out.print('*');
                else

                    System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    private static int count8(int[][] a, int x0, int y0) {
        int tot = 0;
        for (int i = x0 - 1; i <= x0 + 1; ++i)
            for (int j = y0 - 1; j <= y0 + 1; j++) {
                if (i < 0 || i >= a.length || j < 0 || j >= a[i].length) continue;
                if (a[i][j] == MINE) ++tot;

            }
        return tot;
    }
}
