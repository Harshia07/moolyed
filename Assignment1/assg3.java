import java.util.Scanner;

public class assg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();
        String rev = "";
            for (int k = str.length() - 1; k >= 0; k--)
            {
                rev = rev + str.charAt(k);
            }
        if (str.equalsIgnoreCase(rev))
        {
            System.out.println(str + " is a palindrome. ");
        }
        else
        {
            System.out.println(str + " is not a palindrome. ");
        }
    }
}
