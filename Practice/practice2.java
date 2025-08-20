import java.util.LinkedList;
import java.util.Stack;

public class practice2 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2; // Number of rotations
        System.out.println("Original List: " + list);
        rotateLinkedList(list, k);
        System.out.println("Rotated List: " + list);

        System.out.println(infixToPostfix("A+B/C"));
        System.out.println(infixToPrefix("A+B/C"));
    }

    public static void rotateLinkedList(LinkedList<Integer> list, int k) {
        if (list == null || list.size() == 0 || k <= 0) {
            return;
        }

        k = k % list.size(); // Handle cases where k > size of the list
        for (int i = 0; i < k; i++) {
            int lastElement = list.removeLast();
            list.addFirst(lastElement);
        }
    }

    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
    
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
    
            // If the character is an operand, add it to the result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and append until '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // An operator is encountered
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
    
        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
    
        return result.toString();
    }
    
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static String infixToPrefix(String expression) {
        StringBuilder reversedExpression = new StringBuilder(expression).reverse();
        for (int i = 0; i < reversedExpression.length(); i++) {
            char c = reversedExpression.charAt(i);
            if (c == '(') {
                reversedExpression.setCharAt(i, ')');
            } else if (c == ')') {
                reversedExpression.setCharAt(i, '(');
            }
        }

        String postfix = infixToPostfix(reversedExpression.toString());
        return new StringBuilder(postfix).reverse().toString();
    }
    
}

