import java.util.Scanner;
public class diamond 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the range:");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++)
                {
                    System.out.print("*");
                
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++)
                {
                    System.out.print("*");
                
                }
                System.out.println();
            }
        }
    }
}
