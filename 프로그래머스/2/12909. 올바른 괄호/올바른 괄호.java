import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack st1 = new Stack();
        
        if(s.charAt(0) == ')')
            return false;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                st1.push(s.charAt(i));
            } 
            
            if(s.charAt(i) == ')') {
                if(st1.size() == 0)
                    return false;
                st1.pop();
            }
        }
        if(st1.size() != 0)
            answer = false;
        
        return answer;
    }
}