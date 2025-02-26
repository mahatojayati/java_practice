import java.util.Scanner;
class butterfly 
{
    public static void main(String[] args) 
    
        {
            try (Scanner sc = new Scanner(System.in)) 
            {
                System.out.println("Enter the range:");
                int n = sc.nextInt();
                for(int i=1; i<=n; i++)
                {
                    for(int j=1; j<=i; j++)
                    {
                        if((i+j) %2 ==0)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                for(int i=n; i>=1; i--)
                {
                    for(int j=1; j<=i; j++)
                    {
                        if((i+j) %2 ==0)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                       
            }
        }
}

        
