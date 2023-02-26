import java.io.*;
import java.util.*;
class StackDemo{
    void push(Stack<Integer> stack,int elt){
        stack.push(elt);
    }
    void pop(Stack<Integer> stack){
        if(stack.size()==0){
            System.out.println("Empty Stack");
        }
        else{
            int poppedElt = stack.pop();
            System.out.println("Popped Element:"+poppedElt+"\n");
        }

    }
    void peek(Stack<Integer> stack){
        if(stack.size()==0){
            System.out.println("Empty Stack");
        }
        else{
            int peekElt = stack.peek();
            System.out.println("Peek Element:"+peekElt+"\n");
        }

    }
    void showStack(Stack<Integer> stack){
        System.out.println(stack+"\n");
    }
}
class Run{
    public static void main(String[] args) throws IOException {
        int option=0,elt;
        Stack<Integer> s = new Stack<Integer>();
        StackDemo d = new StackDemo();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while(option != 5){
            System.out.println("MENU\n");
            System.out.println("1) Push\n2) Pop\n3) Peek\n4) ShowStack\n5) Exit\n");
            System.out.println("Enter option:");
            option = Integer.parseInt(input.readLine());
            switch(option){
                case 1:
                    System.out.println("Enter element to push:");
                    elt = Integer.parseInt(input.readLine());
                    d.push(s,elt);
                    break;
                case 2:
                    d.pop(s);
                    break;
                case 3:
                    d.peek(s);
                    break;
                case 4:
                    d.showStack(s);
                    break;
                default:break;
            }
        }


    }
}
