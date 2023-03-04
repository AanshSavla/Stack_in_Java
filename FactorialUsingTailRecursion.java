import java.io.*;
import java.util.*;
// Tail Recursion using auxilliary function.
// Difference between tail and non tail recursion is that in non tail recursion a pending operation is performed after resursion e.g. n*Fact(n-1) while in tail recursion there is no pending operation after recursion e.g Fact(n-1,n*res)
class Fact{
    int findFact(int n){
        return findFact1(n,1);
    }
    int findFact1(int n,int res){
        if(n == 1){
            return res;
        }
        else{
            return findFact1(n-1,n*res);
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
