class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s:tokens){
            if(Character.isDigit(s.charAt(s.length()-1))){
                stack.push(Integer.valueOf(s));
            } else {
                int top=stack.pop();
                int bottom=stack.pop();
                switch(s){
                    case "+": stack.push(bottom+top); break;        
                    case "-": stack.push(bottom-top); break;
                    case "*": stack.push(bottom*top); break;
                    case "/": stack.push(bottom/top); break;
                }
            }
        }
        return stack.peek();
    }
}
