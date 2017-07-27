package bag2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by c on 2017/7/26.
 */
public class P1373 {
    static class Range implements Comparable<Range>{
        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return "Range{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        int start,end;


        @Override
        public int compareTo(Range that) {
            if(this.end == that.end){
                return that.start - this.start;
            }
            return this.end-that.end;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Range[] ranges = new Range[n];
        for(int i = 0; i < n; i ++ ){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ranges[i] = new Range(a, b);
        }
        Arrays.sort(ranges);
        int time = 0;
        int s = 0;
        for(int i = 0; i < n; i++ ){
            if(time < ranges[i].getStart()){
                time = ranges[i].getEnd();
                s++;
            }
        }
        System.out.println(n - s);
    }
}
