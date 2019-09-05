package com.sx.algorithm;

import java.util.Stack;

public class TowStackToQueueAlgorithm {
    public static void main(String[] args) {
        TowStackToQueue towStackToQueue = new TowStackToQueue();
        towStackToQueue.push(1);
        towStackToQueue.push(2);
        System.out.println(towStackToQueue.pop());
        towStackToQueue.push(3);
        towStackToQueue.push(4);
        System.out.println(towStackToQueue.pop());
        towStackToQueue.push(5);
        System.out.println(towStackToQueue.pop());
        System.out.println(towStackToQueue.pop());
        System.out.println(towStackToQueue.pop());
        System.out.println(towStackToQueue.pop());
    }
}
class TowStackToQueue{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int num){
        stack1.push(num);
    }

    public int pop(){
        if (stack1.isEmpty()){
            return -1;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int value = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return value;
    }
}