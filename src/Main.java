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
        boolean pal = true;
        for(int x=0; x<n/2; x++)
        {
            if(input.charAt(x)!=input.charAt(n-1-x))
            {
                pal = false;
                break;
            }
        }
        if(pal==true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}