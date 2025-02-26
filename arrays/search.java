import java.util.Scanner;
public class search 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a range:");
            int size = sc.nextInt();
            int n[] = new int[size];
            System.out.println("Enter the elements:");
            for(int i =0; i<=size-1;i++)
            {
                n[i] = sc.nextInt();
            } 
            System.out.println("Enter the element to search:");
            int key = sc.nextInt();
            for(int i =0; i<=size-1;i++)
            {
                if(n[i]==key)
                {
                    System.out.println("Element found at index " + i);

                }
                else
                {
                    System.out.println("Element not found");
                }
            }
        }         
    }

}

