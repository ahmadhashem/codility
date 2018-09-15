// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MinPerimeterRectangle {
    public int solution(int N) {
        int min=Integer.MAX_VALUE;
        int factor = (int)Math.sqrt(N);
        for(int i=1;i<=factor;i++){
            if(N%i==0){
                int j = N/i;
                min=Math.min(min, 2*(i+j));
            }
        }
        return min;
    }
}