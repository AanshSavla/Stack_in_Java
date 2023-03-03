import java.io.*;
import java.util.*;

class PrefixEvaluation{
    String st;
    PrefixEvaluation(String s){
        st = s;
        //System.out.println(s);
    }

    int evaluate(){
        int i,n,op1,op2,result=0;
        char c;
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Character" + "\t" + "Stack" + "\n");
        for(i=st.length()-1;i>=0;i--){
            c = st.charAt(i);
            if(Character.isDigit(c)){
                //System.out.println("Yes");
                n = Character.getNumericValue(c);
                stack.push(n);
            }
            else{
              // Postfix : op2 (op) op1
              // Prefix : op1 (op) op2
                switch(c){
                    case '+':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op1 + op2;
                        break;
                    case '-':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op1 - op2;
                        break;
                    case '*':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op1 * op2;
                        break;
                    case '/':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op1 / op2;
                        break;
                    case '%':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        result = op1 % op2;
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
        System.out.println("Enter Prefix Expression:");
        s = input.readLine();
        PrefixEvaluation pf = new PrefixEvaluation(s);
        result = pf.evaluate();
        System.out.println("Result = "+result);
    }
}
