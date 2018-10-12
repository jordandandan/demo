package Leet2018;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author bjxujiayi
 * @create 2018-10-12 18:12
 **/
public class Leet20 {
    public boolean isValid(String s) {
        if(s==null || s.length() == 0)
            return true;
        if(s.length()<2){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');
        for(int i =0;i<s.length();i++){
            char temp = s.charAt(i);
            if(map.get(temp) != null){
                stack.push(temp);
            }else if(!stack.isEmpty() && map.get(stack.peek()) == temp){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
