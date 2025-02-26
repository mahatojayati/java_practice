import java.util.Scanner;
class oddfunc 
{
    public static int oddSum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                sum += i;
                }
                }
                return sum;
                }
                public static void main(String[] args)
                {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a number:");
                    int n = sc.nextInt();
                    for(int i=1; i<=n; i++)
                    {
                        System.out.print(i+"   ");
                    }
                    System.out.print("\nSum of odd numbers is: " + oddSum(n));
                    sc.close();
                    }
                }
                    
    
