import java.io.*;
import java.util.*;
// In Tower Of Hanoi Problem there are 3 poles. Source pole, Destination pole, Spare pole.We nee to move all discs from Source to Destination pole moving only 1 disc at a time and no bigger disc must be above smaller disc in any pole at any given time.
// Algo: Move n-1 discs from source to spare. Move 1(last) disc from source to dest.Move n-1 discs from spare to destination. Number of steps = 2^n-1 where n:No. of discs.
class TOH{
    int steps = 0;
    int move(int n,char source, char dest, char spare){
        if(n == 1){
            System.out.print("\nMove from "+ source + " to " + dest+"\n");
            steps += 1;
        }
        else{
            move(n-1,source,spare,dest);// Move n-1 discs from source to spare.
            move(1,source,dest,spare);// Move 1(last) disc from source to dest.
            move(n-1,spare,dest,source); // Move n-1 discs from spare to destination.
        }
        return steps;
    }
}

class Run{
    public static void main(String[] args) throws IOException {
        int n,steps;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of discs:");
        n = Integer.parseInt(input.readLine());
        TOH toh = new TOH();
        // A: Source, B: Spare, C: Destination
        steps = toh.move(n,'A','C','B');
        System.out.print("\nNumber of Steps:"+steps);
    }
}
