import java.util.Scanner;

class Stack{
    private int size;
    private int top;
    private int stack[];
    Stack(int n){
        size=n;
        top = -1;
        stack = new int[size];
    }
    void push(int v){
        if(top == size-1){
            System.out.println("Stack Full.Cannot push");
        }
        else{
            top++;
            //System.out.println("top="+top);
            stack[top] = v;
        }
    }
    void pop(){
        int popVal;
        if(top == -1){
            System.out.println("Stack empty.Nothing to pop\n");
        }
        else{
            popVal = stack[top];
            top--;
            System.out.println("Popped Value:"+popVal+"\n");
        }
    }
    void peek(){
        int peekVal;
        if(top == -1){
            System.out.println("Stack empty\n");
        }
        else{
            peekVal = stack[top];
            System.out.println("Peek Value:"+peekVal+"\n");
        }
    }
    void showStack(){
        int i;
        if(top == -1){
            System.out.println("Stack Empty");
        }
        else{
            for(i=0;i<=top;i++){
                System.out.print(stack[i]+"\t");
            }
        }


    }
}

class Run{
    public static void main(String[] args){
        int o=-1,p,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size:");
        n = input.nextInt();
        Stack s = new Stack(n);
        while(o!=5){
            System.out.println("\nMENU\n1)Push Value\n2)Pop Value\n3)Peek Value\n4)Show Stack\n5)EXIT\n");
            System.out.print("Enter o:");
            o = input.nextInt();
            switch(o){
                case 1:
                    System.out.println("Enter value to push:");
                    p = input.nextInt();
                    s.push(p);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.showStack();
                    break;
                default: System.out.println("\nExit");
            }
        }


    }
}
