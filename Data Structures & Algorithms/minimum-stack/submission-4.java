class MinStack {

    private Stack<Integer> st;
    private LinkedList<Integer> list;

    public MinStack() {
        st = new Stack();
        list = new LinkedList<>();
    }
    
    public void push(int val) {
        st.push(val);
        int currentMin = list.isEmpty() ? val : Math.min(list.getFirst(), val);
        list.addFirst(currentMin);
    }
    
    public void pop() {
        int val = st.pop();
        list.removeFirst();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return list.getFirst();     
    }
}
