package Strings.Bits;
class leftshift {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 0;
        int Bitmask = 1<<pos;
    //    if((Bitmask & n) == 0)
    //     {
    //         System.out.println(("the bit was zero."));

    //     }
    //     else
    //     {
    //         System.out.println("The bit was one.");
    //     }
    String result  = ((Bitmask & n) == 0)? "the bit was zero." : "the bit was one.";
    System.out.println(result);

    }
}