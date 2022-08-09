import java.util.*;
class Gas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no of gallons of gas in the tank : ");
        double gas_tank = sc.nextDouble();
        System.out.print("Enter the fuel efficiency in miles per gallon : ");
        double fuel_eff = sc.nextDouble();
        System.out.print("Enter the price of gas per gallon : ");
        double price = sc.nextDouble();
        
        double far = price * 100;
        
        System.out.print("Going a 100 mile will cost " +far);
    }
}
