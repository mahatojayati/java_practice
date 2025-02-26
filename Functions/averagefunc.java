
class averagefunc 
{
   public static int average(int a, int b ,int c)
   {
    int sum = a+b+c;
    int avg = sum/3;
    

    return avg;
   }
   public static void main(String[] args) 
   {
    int a = 10;
    int b = 20;
    int c = 30;
    System.out.println(a+"\n"+b+"\n"+c);
    int avg = average(a, b, c);
    System.out.println("Average of the numbers is: "+avg);
   }

}