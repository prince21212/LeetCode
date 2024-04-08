class MinStack {

    int min;
    int top;
    int[] stack;
    int[] minarr;

    public MinStack() {
        min=Integer.MAX_VALUE; 
        top=-1; 
        stack= new int[100000];
        minarr= new int[10000];
    }
    
    public void push(int val) {
        stack[++top]= val;
        if(top==0){
        min= val;
           minarr[top]= val; 
        }
        else{
            min= Math.min(minarr[top-1], val);
            minarr[top]= min;
        }
    }
    
    public void pop(){
        if(top!=-1){
             top--;
        }
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        if(top==-1){ return -1;}
        return minarr[top];
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