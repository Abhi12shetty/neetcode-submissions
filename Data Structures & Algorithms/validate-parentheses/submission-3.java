class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1) return false;
        String open = "([{";
        String close = ")]}";
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(open.contains(Character.toString(c))){
                stack.push(c);
            }
            if(close.contains(Character.toString(c))){
                int index = close.indexOf(c);
                if(stack.size()>0 && stack.peek().equals(open.charAt(index))){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.size()>0) return false;
        return true;
    }
}
