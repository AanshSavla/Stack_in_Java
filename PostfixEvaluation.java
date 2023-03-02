import java.io.*;
import java.util.*;

class PostfixEvaluation{
    String st;
    PostfixEvaluation(String s){
        st = s;
        //System.out.println(s);
    }

    int evaluate(){
        int i,n,op1,op2,result=0;
        char c;
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Character" + "\t" + "Stack" + "\n");
        for(i=0;i<st.length();i++){
            c = st.charAt(i);
            if(Character.isDigit(c)){
                //System.out.println("Yes");
                n = Character.getNumericValue(c);
                stack.push(n);
            }
            else{
                switch(c){
                    case '+':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op2 + op1;
                        break;
                    case '-':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op2 - op1;
                        break;
                    case '*':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op2 * op1;
                        break;
                    case '/':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op2 / op1;
                        break;
                    case '%':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op2 % op1;
                        break;
                }
               stack.push(result);
            }
             System.out.println(c + "\t\t\t" + stack + "\n");
        }
        result = stack.pop();
        return result;
    }
}

class Run{
    public static void main(String[] args) throws IOException {
        int result;
        String s = new String();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Postfix Expression:");
        s = input.readLine();
        PostfixEvaluation pf = new PostfixEvaluation(s);
        result = pf.evaluate();
        System.out.println("Result = "+result);
    }
}
