import java.util.*;
class Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1;
        String str2;
        
        System.out.print("Enter str1 : ");
        str1 = sc.nextLine();
        System.out.print("Enter str2 : ");
        str2 = sc.nextLine();
        
        if(str1.equals("A"))
        {
            str1 = "Ace";
        }
        else if(str1.equals("1"))
        {
            str1 = "one";
        }
        else if(str1.equals("2"))
        {
            str1 = "two";
        }
        else if(str1.equals("3"))
        {
            str1 = "three";
        }
        else if(str1.equals("4"))
        {
            str1 = "four";
        }
        else if(str1.equals("5"))
        {
            str1 = "five";
        }
        else if(str1.equals("6"))
        {
            str1 = "six";
        }
        else if(str1.equals("7"))
        {
            str1 = "seven";
        }
        else if(str1.equals("8"))
        {
            str1 = "eight";
        }
        else if(str1.equals("9"))
        {
            str1 = "nine";
        }
        else if(str1.equals("10"))
        {
            str1 = "ten";
        }
        else if(str1.equals("A"))
        {
            str1 = "Ace";
        }
        else if(str1.equals("J"))
        {
            str1 = "Jack";
        }
        else if(str1.equals("Q"))
        {
            str1 = "Queen";
        }
        else if(str1.equals("K"))
        {
            str1 = "King";
        }
        
        if(str2.equals("D"))
        {
            str2 = "Diamonds";
        }
        else if(str2.equals("H"))
        {
            str2 = "Heart";
        }
        else if(str2.equals("S"))
        {
            str2 = "Spades";
        }
        else if(str2.equals("C"))
        {
            str2 = "Clubs";
        }
        //return str1 "of" str2;
        System.out.print(str1);
        System.out.print(" of ");
        System.out.print(str2);
    }
}
