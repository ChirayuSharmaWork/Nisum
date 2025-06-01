import java.util.ArrayDeque;
import java.util.SplittableRandom;

class Stack{
    ArrayDeque<Integer> s = new ArrayDeque<>();

    public void push(int a){
        s.push(a);
    }
    public Integer pop(){
        if(s.isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return s.pop();

    }
    public Integer peek(){
        if(s.isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return s.peek();
    }

}


public class q11{
public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(42);
        System.out.println("Top element is : " + s.peek());
        s.push(14);
        s.push(46);
        System.out.println("System just popped out  : " + s.pop());
        System.out.println("Top element is : " + s.peek());
}
    }