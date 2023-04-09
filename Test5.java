import java.util.*;
import java.util.Scanner;
public class Test5{
        public static void main(String[] args){
             Scanner scn = new Scanner(System.in);
                System.out.println("Enter the input string: ");
                String str = scn.nextLine();
                System.out.println(rec(str, str.length()-1));
        }
        public static int rec(String str, int n) {
            if (n == 0) {
                return str.charAt(0) - '0';
            }
            return (rec(str, n - 1)*10 + str.charAt(n) - '0');
        }
}
