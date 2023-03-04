import java.io.*;
import java.util.*;

class Fibo{
    int findFibo(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return findFibo(n-1)+findFibo(n-2);
        }
    }
}

class Run{
    public static void main(String[] args) throws IOException {
        int number,ans;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");
        number = Integer.parseInt(input.readLine());
        Fibo fb = new Fibo();
        ans = fb.findFibo(number);
        System.out.println("Fibonacci = "+ans);
    }
}
