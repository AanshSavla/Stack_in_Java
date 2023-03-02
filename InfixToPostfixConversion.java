import java.io.*;
import java.util.*;

class InfixToPostfix{
    String st,postfixExp;
    Stack<Character> stack = new Stack<Character>();
    InfixToPostfix(String str){
        // Appending ')' to string.
        st = str+')';
        //System.out.println(st);
    }

    static int getPriority(char c){
        if(c == '*' || c == '/' || c == '%'){
            return 2;
        }
        else if(c == '+' || c == '-'){
            return 1;
        }
        else return 0;
    }

    String convert(){
        int i;
        char c = '0';
        postfixExp = "";
        // Pushing '(' as start symbol
        stack.push('(');
        System.out.println("Character\tStack\tExpression\n");
        for(i=0;i<st.length();i++){
            //System.out.println(st.charAt(i));
            c = st.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            else if(Character.isAlphabetic(c)){
                postfixExp += c;
            }
            else if(c == '+' || c =='-' || c == '*' || c == '/' || c == '%'){
                while(getPriority(stack.peek()) >= getPriority(c)){
                    postfixExp += stack.pop();
                }
                stack.push(c);
                //System.out.println(c + "\n");
            }
            else if(c == ')'){
                while(stack.size()!=0 && stack.peek() != '('){
                    postfixExp += stack.pop();
                }
                stack.pop();
            }
            System.out.println(c + "\t\t" + stack + "\t\t" + postfixExp + "\n");
        }
        if(stack.size() != 0){
            while(stack.peek() != '('){
                postfixExp += stack.pop();
            }
            stack.pop();
        }

        return postfixExp;
    }

}

class Run{
    public static void main(String[] args) throws IOException {
        String s = new String();
        String postfix;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string:");
        s = input.readLine();
        InfixToPostfix itp = new InfixToPostfix(s);
        postfix = itp.convert();
        System.out.print("Postfix Expression:"+postfix);
    }
}
