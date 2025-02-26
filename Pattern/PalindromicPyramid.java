public class PalindromicPyramid {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) 
        {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print("  ");
            }
            // Print the decreasing sequence
            for (int j = i; j >= 1; j--) 
            {
                System.out.print(j+" ");
            }

            // Print the increasing sequence
            for (int j = 2; j <= i; j++) 
            {
                System.out.print(j+" ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
