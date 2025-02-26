import java.util.Scanner;
class sumfunc
{
    public static float Sum(float a , float b)
    {
        float sum = a + b;
        return sum;
    }
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            float a = sc.nextFloat();
            System.out.println("Enter the second number:");
            float b = sc.nextFloat();
            float sum = sumfunc.Sum(a,b);
            System.out.println(sum);
        }
    }
}


   