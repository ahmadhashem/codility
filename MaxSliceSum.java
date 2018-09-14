// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int N=A.length, maxSlice = A[0], maxEndingHere=A[0];
        for(int i=1;i<N;i++){
            int x = A[i];
            maxEndingHere = Math.max(x, maxEndingHere+x);
            maxSlice = Math.max(maxSlice, maxEndingHere);
        }
        return maxSlice;
    }
}