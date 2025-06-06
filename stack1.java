import java.util.Stack;
public class stack1 {
	static void infixToPost(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            }else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                	result.append(stack.pop());
                	}
                stack.pop();
                }else {
                while (!stack.isEmpty()
                        && (P(s.charAt(i)) < P(stack.peek())
                                || (P(s.charAt(i)) == P(stack.peek())))) {
                    result.append(stack.pop());}
                stack.push(c); }}

        while (!stack.isEmpty()) {
            result.append(stack.pop());}
        
        System.out.println(result);
        }
    static int P(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;}

    
    ////////////////////
    public static void main(String[] args) {
        String L = "2+3*(4/6)-2";
        infixToPost(L);}}

