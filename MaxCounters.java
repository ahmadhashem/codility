// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MaxCounters {
    public int[] solution(int N, int[] A) {
        int [] counters = new int[N];
        int maxCounter=0, maxNo=0;
        for(int i=0;i<A.length;i++){
            int a = A[i];
            int counterIndex = a-1;
            if( a == N+1 ){
                maxCounter = maxNo;
            }
            else{
                counters[counterIndex] = Math.max(counters[counterIndex], maxCounter);
                counters[counterIndex]++;
                maxNo = Math.max(maxNo, counters[counterIndex]);
            }
        }
        for(int i=0;i<counters.length;i++){
            counters[i] = Math.max(counters[i], maxCounter);
        }
        return counters;
    }
}