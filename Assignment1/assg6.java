import java.util.Scanner;

public class assg6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();
        String temp ="";
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                temp= temp +str.charAt(i);
            }
        }
        System.out.println("Given String: "+str);
        System.out.println("Output: "+temp);
    }
}
