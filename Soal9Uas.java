package soal9uas;
public class Soal9Uas {
    public static void main(String[] args) {
        Staqck<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '[' || c == '}') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c== '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public void main(String[] args) {
        String expression = "{()}[]";
        if (check(expression)) {
            System.out.println("Expression is balanced");
        } else {
            System.out.println("Expression is not balanced");
        }
    }
    
}
