import java.util.*;

public class ParenthesesChecker {

//    Both the active method and the method commented out below were tested
//    Both would pass for about half the tests but not for the other half
    
    public static boolean checkParentheses(String testString) {
        if ((testString.length() % 2) == 1) return false;
        else {
            Stack<Character> s = new Stack<>();
            for (char bracket : testString.toCharArray())
                switch (bracket) {
                    case '{': s.push('}'); break;
                    case '(': s.push(')'); break;
                    case '[': s.push(']'); break;
                    case '<': s.push('>'); break;
                    default :
                        if (s.isEmpty() || bracket != s.peek()) { return false;}
                        s.pop();
                }
            return s.isEmpty();
        }
    }

//    private boolean checker;
//    private String testString;
//
//    public boolean checkParentheses (String testString){
//        if (null == testString || ((testString.length() % 2) != 0)) {
//            return false;
//        } else {
//            char[] ch = testString.toCharArray();
//            for (char c : ch) {
//                if (!(c == '{' || c == '[' || c == '(' || c == '<' || c == '}' || c == ']' || c == ')' || c == '>' )) {
//                    return false;
//                } else{
//                    return true;}
//            }
//        } return true;
//    }


}