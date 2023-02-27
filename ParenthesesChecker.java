import java.io.*;
import java.util.*;

class StackDemo{
    void push(Stack<Character> stack,char elt){
        stack.push(elt);
    }
    char pop(Stack<Character> stack){
        char popElt = '0';
        if(stack.size() != 0 ){
            popElt = stack.pop();
        }
        return popElt;
    }
    void showStack(Stack<Character> stack){
        System.out.println("Stack:"+stack);
    }
}

public class Run{
    public static void main(String[] args) throws IOException{
        Stack<Character> s = new Stack<Character>();
        StackDemo sd = new StackDemo();
        int i,flag=0;
        char c,p;
        String st = new String();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter expression:");
        st = input.readLine();
        if(st != null){
            for(i=0;i<st.length();i++){
                c = st.charAt(i);
                if(c == '{' || c == '[' || c == '('){
                    sd.push(s,c);
                }
                else if(c == '}' || c == ']' || c == ')'){
                    p = sd.pop(s);
                    if((c == '}' && p != '{') || (c == ']' && p != '[') || (c == ')' && p != '(')){
                        flag = 1;
                        break;
                    }
                }

            }
            if(s.size() != 0){
                flag = 1;
            }
            if(flag == 1){
                System.out.println("Parentheses Not Matching.");
            }
            else{
                System.out.println("Parentheses Matched.");
            }
            sd.showStack(s);
        }
        else{
            System.out.println("No Expression to check.");
        }

    }
}
