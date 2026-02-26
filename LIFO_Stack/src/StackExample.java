public class StackExample {

    public static boolean isBalanced(String s) {
        CharStack stack = new CharStack(s.length());

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char open = stack.pop();
                if ((c == ')' && open != '(') || (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}