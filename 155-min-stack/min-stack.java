class MinStack {
    Stack<Integer> obj;
     Stack<Integer> minstack;
    public MinStack() {
      obj=new Stack<>();
     minstack=new Stack<>();  
    }
    
    public void push(int val) {
        if(obj.isEmpty()){
            obj.push(val);
            minstack.push(val);
        }
        else if(minstack.peek()>val){
             obj.push(val);
             minstack.push(val);
        }
        else{
            obj.push(val);
            minstack.push(minstack.peek());
        }
        
    }
    
    public void pop() {
        obj.pop();
        minstack.pop();
    }
    
    public int top() {
        if(obj.isEmpty()){
            return -1;
        }
        else{
            return obj.peek();
        }
    }
    
    public int getMin() {
         if(obj.isEmpty()){
            return -1;
        }
        else{
            return minstack.peek();
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */