package Algo.Stack;

public class StackTester {
    public static void main(String[] args){
       LStack stack=new LStack();
       stack.push(5);
       stack.push(3);
       stack.push(7);
       stack.push(4);
       stack.push(2);
       stack.print();
       stack.pop();
       System.out.println(stack.peek());
       stack.pop();
       System.out.println(stack.peek());
       stack.delete();
       stack.print();
    }
}
