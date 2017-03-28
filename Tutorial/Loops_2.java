import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            if(a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <=15){
                int output = 0;
                output = a + b;
                System.out.print(output + " ");
            
                for(int j=1;j<n;j++){
                    output = output + (int)Math.pow(2,j) * b;  
                    System.out.print(output + " ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}

/*
Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
