import java.io.*;
import java.util.*;

class Fact{
    int findFact(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*findFact(n-1);
        }
    }
}

class Run{
    public static void main(String[] args) throws IOException {
        int number,ans;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number:");
        number = Integer.parseInt(input.readLine());
        Fact f = new Fact();
        ans = f.findFact(number);
        System.out.println("Factorial = "+ans);
    }
}
