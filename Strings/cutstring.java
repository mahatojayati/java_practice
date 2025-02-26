// to cut a line and print a piece of string
class cutstring 
{
    public static void main(String[] args) {
        String str = "Hello, World!";
        String words = str.substring(3,9);
        for (int i = 0; i < words.length(); i++) {
            System.out.println(words);
        }
    }
    }
    
