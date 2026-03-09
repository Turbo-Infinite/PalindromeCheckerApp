//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.next();
        System.out.print("Is it a palindrome? : ");
        int n = input.length();
        if(check(input,0,n-1)==true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    private static boolean check(String s, int start, int end)
    {
        if(start==end)
        {
            return true;
        }
        else if (s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
        else
        {
            return check(s,start+1,end-1);
        }
    }
}