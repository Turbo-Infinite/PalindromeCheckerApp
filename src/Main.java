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
        char[] ar = input.toCharArray();
        int start = 0, end = n-1;
        boolean isPalindrome = true;
        while(start<end)
        {
            if(ar[start]!=ar[end])
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome==true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}