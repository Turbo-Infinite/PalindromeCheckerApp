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
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray())
        {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for(char c : input.toCharArray())
        {
            char ch = stack.pop();
            if(ch!=c)
            {
                isPalindrome = false;
                break;
            }
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