import java.util.Scanner;
public class length
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("Length of the string is: " + length);
    }
}



