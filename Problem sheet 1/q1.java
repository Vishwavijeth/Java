import java.util.*;
class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String from;
        String to;
        double value;
        
        System.out.print("Convert from? ");
        from = sc.nextLine();
        System.out.print("Convert to? ");
        to = sc.nextLine();
        System.out.print("Value? ");
        value = sc.nextDouble();
        
        if(from.equals("fl.oz") && to.equals("ml"))
        {
            double ml = value * 29.57353;
            System.out.print("ml : " +ml);
        }
        else if(from.equals("gal") && to.equals("l"))
        {
            double l = value * 3.785412;
            System.out.print("l : " +l);
        }
        else if(from.equals("oz") && to.equals("g"))
        {
            double g = value * 28.349523;
            System.out.print("g : " +g);
        }
        else if(from.equals("lb") && to.equals("kg"))
        {
            double kg = value / 2.2046;
            System.out.print("kg : " +kg);
        }
        else if(from.equals("in") && to.equals("mm"))
        {
            double mm = value * 25.4;
            System.out.print("mm : " +mm);
        }
        else if(from.equals("ft") && to.equals("cm"))
        {
            double cm = value *  30.48;
            System.out.print("cm : " +cm);
        }
        else if(from.equals("mi") && to.equals("m"))
        {
            double m = value * 1609.344;
            System.out.print("m : " +m);
        }
        else
        {
            System.out.print("Invalid!!");
        }
    }
}
