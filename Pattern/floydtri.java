import java.util.Scanner;
class floydtri
{
    public static void main (String args [])
    {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the range:");
           int n = sc.nextInt();
           int number = 1;
           for(int i=1; i<=n; i++)
           {
            for(int j=1; j<=i; j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
           }
    }
    }
}