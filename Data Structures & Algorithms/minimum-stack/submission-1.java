class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        this.stack=new Stack<>();
        this.minStack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.size()>0){
            minStack.push(Math.min(minStack.peek(), val));
        }else{
            minStack.push(val);
        }
        
        
    }
    
    public void pop() {
        if(stack.size()==0 || minStack.size()==0)
            return;
        this.stack.pop();
        this.minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
