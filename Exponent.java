import java.io.*;
import java.util.*;

class Exp{
    int findExp(int n, int exp){
        if(exp == 0){
            return 1;
        }
        else{
            return n*findExp(n,exp-1);
        }
    }
}

class Run{
    public static void main(String[] args) throws IOException {
        int number,exp,ans;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");
        number = Integer.parseInt(input.readLine());
        System.out.println("Enter exponent:");
        exp = Integer.parseInt(input.readLine());
        Exp e = new Exp();
        ans = e.findExp(number,exp);
        System.out.println("Number raise to exponent = "+ans);
    }
}
