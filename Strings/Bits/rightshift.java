public class rightshift 
{
    public static void main(String[] args)
    {
        int n = 5;
        int pos = 3;
        int result = pos >> n;
        System.out.println("The right shifted value is: " + result);  // Output: 1
        if((result & n) == 0)
        {
            System.out.println("The bit is zero.");
            
        }
        else
        {
            System.out.println("The bit is one.");
        }
    }
    
}
