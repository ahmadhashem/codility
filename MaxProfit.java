// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MaxProfit {
    public int solution(int[] A) {
        int N = A.length, maxProfitEndingHere = 0, maxProfit = 0, minPrice=0;
        if( N > 1 ){
            minPrice = A[0];
            for(int i=1;i<N;i++){
                minPrice = Math.min(minPrice, A[i]);
                //System.out.println("minPrice="+minPrice);
                int profit = A[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        
        return maxProfit;
    }
}