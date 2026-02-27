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
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : input.toCharArray())
        {
            deque.add(c);
        }
        boolean isPalindrome = true;
        while(deque.size() > 1)
        {
            if(deque.removeFirst()!=deque.removeLast())
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