import java.util.Random;
// Random rm = new Random();

class Account {
    long accNum;
    int no_of_acc;
    String owner;
    double balance;
    
    // Account(double initBal, String owner, long number){
    //     this.initBal = initBal;
    //     this.owner = owner;
    //     this.number = number;
    //     no_of_acc++;
    // }
    
    // Account(double initBal, String owner){
    //     this.initBal = initBal;
    //     this.owner = owner;
        
    //     accNum = String.valueOf((int) Math.round(Math.random()*1000)); 
    //     no_of_acc++;
    // }
    
    Account(String owner){
        this.owner = owner;
        no_of_acc++;
        Random rm = new Random();
        accNum = rm.nextLong();
        System.out.print("Account number of owner " +owner +" is " +accNum  +"\n");
        
    }
    
    void Deposit(int amount){
        balance += amount;
        System.out.print("\n");
        System.out.print("Available balance in the account " +owner +" is " +balance);
        
    }
    
    void withdrawal(int amount){
        if(amount < balance){
            balance -= amount;
            System.out.print("\n");
            System.out.print("Balance after withdrawal: " +balance);
        }
        else{
            System.out.print("\n");
            System.out.print("Insufficient balance");
        }
    }
    
    void closed(){
        no_of_acc--;
        System.out.print("\n");
        System.out.print("Closed " +owner +"\n");
    }
    
    void numAccount(){
        System.out.print("\n");
        System.out.print("Number of accounts currently active : " +no_of_acc);
    }
}

class Acc{
    public static void main(String[] args){
    Account a1 = new Account("a");
    Account a2 = new Account("b");
    //System.out.print(a1.accNum);
    a1.Deposit(1000);
    a1.withdrawal(100);
    a1.closed();
    a1.numAccount();
    
    a2.Deposit(2000);
    
    
    }
}
