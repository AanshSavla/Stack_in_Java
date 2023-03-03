import java.io.*;
import java.util.*;

class InfixToPrefix{
    String st,prefixExp="",postfixExp,rev="";
    Stack<Character> stack = new Stack<Character>();
    InfixToPrefix(String str){
        int i;
        char c;
        //Reversing infix expression
        for(i=0;i<str.length();i++){
            c = str.charAt(str.length()-1-i);
            if(c == '('){
                rev += ')';
            }
            else if(c == ')'){
                rev += '(';
            }
            else{
                rev += c;
            }

        }
        System.out.println("Infix reversed:"+rev);
        // Appending ')' to string.
        st = rev+')';
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
                // In postfix it it >= and in prefix it is >.
                while(getPriority(stack.peek()) > getPriority(c)){
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
        //Reversing the postfix expression.
        for(i=0;i<postfixExp.length();i++){
            c = postfixExp.charAt(postfixExp.length()-1-i);
            prefixExp += c;
        }
        return prefixExp;
    }

}

class Run{
    public static void main(String[] args) throws IOException {
        String s = new String();
        String prefix;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string:");
        s = input.readLine();
        InfixToPrefix itp = new InfixToPrefix(s);
        prefix = itp.convert();
        System.out.print("Prefix Expression:"+prefix);
    }
}
