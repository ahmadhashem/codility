// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Nesting {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<S.length();i++){
            Character c = S.charAt(i);
            if( c == ')' ){
                if( stack.isEmpty() )
                    return 0;
                stack.pop();
            }
            else if( c == '('){
                stack.push(c);
            }
        }
        if( stack.isEmpty() )
            return 1;
        return 0;
    }
}
