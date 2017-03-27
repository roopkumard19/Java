import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);//Complete this line
            }
            System.out.println("================================");

    }
}

/*
Input (stdin)
java 100
cpp 65
python 50
Your Output (stdout)
================================
java           100
cpp            065
python         050
================================
Expected Output
================================
java           100 
cpp            065 
python         050 
================================
*/
