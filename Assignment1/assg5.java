import java.util.Scanner;

public class assg5 {
    public static double rad(float a)
    {
        float sq= a*a;
        double ar= 3.14*sq;
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Radius please:");
        float r=sc.nextFloat();
        System.out.println("RADIUS-->"+r);
        System.out.println("AREA OF CIRCLE-->"+rad(r));
    }
}
