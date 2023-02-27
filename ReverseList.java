import java.io.*;
import java.util.*;

class Run{
    public static void main(String args[]) throws IOException {
        int i,n;
        Stack<Integer> s = new Stack<Integer>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of elements:");
        n = Integer.parseInt(input.readLine());
        int list[] = new int[n];
        int reverse[] = new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter number:");
            list[i] = Integer.parseInt(input.readLine());
            s.push(list[i]);
        }
        System.out.print("\nOriginal List: ");
        for(i=0;i<n;i++){
            System.out.print(list[i]+" ");
        }
        for(i=0;i<n;i++){
            reverse[i] = s.pop();
        }
        System.out.print("\nReversed list: ");
        for(i=0;i<n;i++){
            System.out.print(reverse[i]+" ");
        }
    }
}
