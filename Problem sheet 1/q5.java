import java.util.*;
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;
        
        System.out.print("Enter day : ");
        day = sc.nextInt();
        System.out.print("Enter month : ");
        month = sc.nextInt();
        System.out.print("Enter year : ");
        year = sc.nextInt();
        
        if(day <=31 && month == 1)
        {
            System.out.print("January ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=31 && month == 3)
        {
            System.out.print("March ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=31 && month == 5)
        {
            System.out.print("May ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=31 && month == 7)
        {
            System.out.print("July ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=31 && month == 8)
        {
            System.out.print("August ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=31 && month == 10)
        {
            System.out.print("October ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=31 && month == 12)
        {
            System.out.print("December ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=30 && month == 4)
        {
            System.out.print("April ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=30 && month == 6)
        {
            System.out.print("June ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=30 && month == 9)
        {
            System.out.print("September ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=30 && month == 11)
        {
            System.out.print("November ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=31 && month == 3)
        {
            System.out.print("March ");
            System.out.print(month);
            System.out.print( year);
        }
        else if(day<=28 && month == 2)
        {
            if(year % 4 ==0)
            {
                System.out.print("February "+day +"\t"+year+"\n");
                System.out.print("leap year");
            }
            else
            {
                System.out.print("February "+day +"\t"+year+"\n");
                System.out.print("Not a leap year");
            }
        }
        else
        {
            System.out.print("Invalid date");
        }
    }
}
