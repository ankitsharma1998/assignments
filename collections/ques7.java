package com.introductiontocollections;
import java.util.Stack;

class SpecialStack extends Stack<Integer>{

    Stack<Integer> minStack = new Stack<>();//creating a stack which will have minimum element on top,
    // the element in it will be same as the one in the stack
    public void push(int element){
        if (isEmpty()) {
            super.push(element);
            minStack.push(element);
        }
        else if(isFull()){
            System.out.println("Stack Overflow");
        }
        else {                  // to push the minimum element on top in min stack
            super.push(element);
            int y = minStack.pop();
            minStack.push(y);
            minStack.push(Math.min(element, y));
        }

    }

    public Integer pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int element = super.pop();
        minStack.pop();
        return element;
    }

    public boolean isFull(){
        // checking if capacity of stack is same as the size of stack.
        return super.capacity() == super.size();                       // then stack is full
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getMin(){    // to return the minimum element in stack. we will return the top element of min stack
        int min = minStack.pop();
        minStack.push(min);
        return min;
    }
}

public class ques7 {

    public static void main(String[] args){
        SpecialStack stack = new SpecialStack();
        stack.push(1);
        stack.push(56);
        stack.push(9);
        stack.push(12);

        System.out.println("pop element on the top \n Element is: "+stack.pop());

        System.out.println("Minimum element in the stack is: "+stack.getMin());

    }
}
