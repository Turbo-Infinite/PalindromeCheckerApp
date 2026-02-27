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
//        boolean pal = true;
        String rev = "";
        for(int x=n-1; x>=0; x--)
        {
            rev += input.charAt(x);
        }
        if(rev.equalsIgnoreCase(input))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}