// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int dominator = 0;
        int count = 0;
        int N = A.length;
        for(int i=0;i<N;i++){
            if( count == 0 ){
                dominator = A[i];
                count++;
            }
            else if( A[i] != dominator ){
                count--;
            }
        }
        
        count=0;
        int index = 0;
        for(int i=0;i<N;i++){
            if( A[i] == dominator ){
                index = i;
                count++;
            }
        }
        if( count > N/2 )
            return index;
        return -1;
    }
}
