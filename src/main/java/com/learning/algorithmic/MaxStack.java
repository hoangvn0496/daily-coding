package com.learning.algorithmic;

import java.util.Stack;

public class MaxStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> maxVal = new Stack<>();

    public void push(int val) {
        st.push(val);
        if (maxVal.isEmpty() || val > maxVal.peek()) {
            maxVal.push(val);
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMax() {
        return maxVal.peek();
    }
    
    public static void main(String[] args) {
        MaxStack t = new MaxStack();
        t.push(1);
        t.push(3);
        t.push(2);
        t.push(5);
        t.push(10);
        t.push(4);
        System.out.println(t.getMax());
    }
}
