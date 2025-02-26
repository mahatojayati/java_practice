// To check the number of uppercase and lowercase alphabets in a paragraph.
/*import java.util.Scanner;
public class check 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string.");
        String paragraph = sc.nextLine();
        int uppercase = 0, lowercase = 0; char ch = 0;
        for (int i = 0; i < paragraph.length(); i++)    
        {
            ch = paragraph.charAt(i);
        }
        if (Character.isUpperCase(ch))
        {
            uppercase++;
        }
        else
        {
            lowercase++;
        }
        System.out.println("Number of uppercase alphabets: " + uppercase);
        System.out.println("Number of lowercase alphabets: " + lowercase);
    }
    }*/

    public class CharacterCount {
        public static void main(String[] args) {
            String paragraph = "Hey, rich lady!";
            
            int uppercaseCount = 0;
            int lowercaseCount = 0;
    
            for (int i = 0; i < paragraph.length(); i++) {
                char ch = paragraph.charAt(i);
    
                if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                }
            }
    
            System.out.println("Number of uppercase letters: " + uppercaseCount);
            System.out.println("Number of lowercase letters: " + lowercaseCount);
        }
    }
    
    

