import java.util.*;
import java.util.Scanner;
public class Test3{
        public static void main(String[] args){
             Scanner scn = new Scanner(System.in);
                System.out.println("Enter the input string: ");
                String s = scn.nextLine();
                System.out.println(totalConsonants(s, s.length()));
        }
        public static int totalConsonants(String str, int n) {
            if (n == 1) {
                if(isconsonant(str.charAt(0)))
                    return 1;
                else
                    return 0;
            }
            if(isconsonant(str.charAt(n - 1)))
                return totalConsonants(str, n - 1) + 1;
            else
                return totalConsonants(str, n - 1);
        }
        public static boolean isconsonant(char ch){
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return false;
            }
            return true;
        }
}
