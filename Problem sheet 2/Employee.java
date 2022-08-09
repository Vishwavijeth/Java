class Employee{
    String name;
    double salary;
    
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}

class emp{
public static void main(String[] argv){
    Employee e = new Employee("abc", 123);
    System.out.print("Name : " +e.name + "\nsalary : " +e.salary);
}
}
