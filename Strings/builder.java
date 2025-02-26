public class builder 
{
    public static void main(String[] args) {

        StringBuilder sc = new StringBuilder("ello");
        // sc.append(" World");
        // sc.insert(5, 4);
        // sc.delete(5, 7);
        // sc.reverse();
        // sc.setCharAt(4, 'P');
        // System.out.println(sc.charAt(0));
        // System.out.println(sc.length());
        // System.out.println(sc.capacity());
        // System.out.println(sc.toString());

        // System.out.println(sc);
        char frontchar; char backchar;
        for(int i=0;i<=sc.length()/2;i++)
        {
            int front = i;
            int back = sc.length()-i-1;
            frontchar = sc.charAt(i);
            backchar = sc.charAt(sc.length()-i-1);

           sc.setCharAt(front, backchar);
           sc.setCharAt(back, frontchar);
        
        }
        System.out.println(sc);


    }
}
