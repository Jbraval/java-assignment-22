import java.util.*;
import java.util.Scanner;
public class Test2{
        public static void main(String[] args){
             Scanner scn = new Scanner(System.in);
                System.out.println("Enter the input string: ");
                String s = scn.nextLine();
                System.out.println(rec(s, 0));
        }
        public static String rec(String s, int idx) {
                if(idx == s.length()) return "";
                if(Character.isUpperCase(s.charAt(idx))) return s.substring(idx);
                return rec(s, idx+1);
        }
}