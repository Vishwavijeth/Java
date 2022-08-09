import java.util.*;
class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String str = sc.nextLine();
        double mark = 0;
        //System.out.print(str);
        if(str.equals("A+"))
        {
            mark = 4.0;
            System.out.print(mark);
        }
        else if(str.equals("B+"))
        {
            mark = 3.3;
            System.out.print(mark);
        }
        else if(str.equals("B-"))
        {
            mark = 2.7;
            System.out.print(mark);
        }
        else if(str.equals("C+"))
        {
            mark = 2.3;
            System.out.print(mark);
        }
        else if(str.equals("B-"))
        {
            mark = 1.7;
            System.out.print(mark);
        }
        else if(str.equals("C+"))
        {
            mark = 1.3;
            System.out.print(mark);
        }
        else if(str.equals("C-"))
        {
            mark = 0.7;
            System.out.print(mark);
        }
        else if(str.equals("F"))
        {
            mark = 0;
            System.out.print(mark);
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}
