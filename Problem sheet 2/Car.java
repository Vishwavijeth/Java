class Car{
    double i_fuel;
    double distance;
    double fuel_eff;
    
    Car(double eff){
        //this.eff = eff;
        fuel_eff = eff;
        i_fuel = 0;
        distance = 0;
    }
    
    void tank(double gas){
        i_fuel += gas;
        System.out.print("\n");
        System.out.print("\nTotal fuel : " +i_fuel);
    }
    
    void drive(double drive){
        distance += drive; 
        System.out.print("\n");
        System.out.print("\nTotal distance drove : " +distance);
    }
    
    void getFuelLevel(){
        double remaining_f = i_fuel -(distance / fuel_eff);
        System.out.print("Remaining fuel : " +(int)remaining_f);
    }
}

class Fuel{
    public static void main(String[] args){
        Car c = new Car(29);
        c.tank(20);
        c.drive(100);
        c.getFuelLevel();
    }
}
