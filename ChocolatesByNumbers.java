// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class ChocolatesByNumbers {
    public int solution(int N, int M) {
        int x = gcd(N, M);
        return N/x;
    }
    
    private int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
