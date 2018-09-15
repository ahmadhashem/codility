// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CountFactors{
    public int solution(int N) {
        // write your code in Java SE 8
        int factor = (int)Math.sqrt(N), result=0;
        for(int i=1;i<=factor;i++){
            if( N%i==0 ){
                if(N/i==i)
                    result++;
                else
                    result+=2;
            }
        }
        return result;
    }
}