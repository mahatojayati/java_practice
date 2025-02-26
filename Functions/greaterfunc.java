public class greaterfunc
{
    public static int greaterNo(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
        
    
    }
        public static void main(String[] args)
        {
            
            int a = 10;
            int b = 20;
            int c = greaterNo(a, b);
            System.out.println("Greater number is: " + c);

        }
    }

        

    

