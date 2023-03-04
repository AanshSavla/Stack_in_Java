import java.io.*;
import java.util.*;

class GCD{
    int findGCD(int n1, int n2){
        if(n2 == 0){
            return n1;
        }
        else{
            return findGCD(n2,n1%n2);
        }
    }
}

class Run{
    public static void main(String[] args) throws IOException {
        int a,b,ans;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a:");
        a = Integer.parseInt(input.readLine());
        System.out.println("Enter b:");
        b = Integer.parseInt(input.readLine());
        GCD g = new GCD();
        ans = g.findGCD(a,b);
        System.out.println("GCD = "+ans);
        System.out.println("LCM = "+(a*b)/ans);
    }
}
