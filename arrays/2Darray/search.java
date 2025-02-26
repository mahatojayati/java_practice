import java.util.Scanner;
public class search 
{
    public static void main(String args [])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(("Enter the range:"));
            int size = sc.nextInt();
            int arr[] [] = new int[size][size];
            System.out.println("Enter the elements:");
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    arr[i][j] = sc.nextInt();

                }

            }
            System.out.println("Enter the number:");
            int num = sc.nextInt();
                for(int i=0;i<size;i++)
                {
                    for(int j=0;j<size;j++)
                    {
                        if(num==arr[i][j])
                        {
                            System.out.println("Number found at position ("+(i+1)+","+(j+1));


                        }
   
                    }

                }
        }
        }
    }

