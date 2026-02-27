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
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray())
        {
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while(!queue.isEmpty())
        {
            if(stack.pop()!=queue.remove())
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