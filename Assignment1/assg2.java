import java.util.Scanner;

public class assg2 {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Number:");
                int n=sc.nextInt();
                int m=n/2;
                boolean flag = true;
                for (int i = 2; i <= m;i++) {
                    // condition for nonprime number
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag==true)
                    System.out.println(n+ " is a prime number.");
                else
                    System.out.println(n + " is not a prime number.");
            }
        }

