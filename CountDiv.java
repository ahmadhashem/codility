// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CountDiv {
    public int solution(int A, int B, int K) {
        int count = (B/K)-(A/K);
        count += A%K==0?1:0;
        return count;
    }
}