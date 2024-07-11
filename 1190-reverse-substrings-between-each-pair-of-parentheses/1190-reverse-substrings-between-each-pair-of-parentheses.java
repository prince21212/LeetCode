class Solution {
    public String reverseParentheses(String s) {
       Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == ')') {
                // We need to reverse the substring within the parenthesis
                List<Character> temp = new ArrayList<>();
                
                // Pop characters until we find the matching '('
                while (stack.peek() != '(') {
                    temp.add(stack.pop());
                }
                stack.pop(); // pop the '('
                
                // Push the reversed substring back onto the stack
                for (char ch : temp) {
                    stack.push(ch);
                }
            } else {
                // Push the current character onto the stack
                stack.push(c);
            }
        }
        
        // Build the final result from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();
    }
}
