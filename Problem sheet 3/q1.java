class Account
{
    double balance;
    
    Account(double acc)
    {
        balance = acc;
    }
    
    void deposit(double amount)
    {
        balance += amount;
    }
    
    void withdraw(double amount)
    {
        if(amount < balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.print("\nInsufficient balance\n");
        }
    }
    
    void balance()
    {
        System.out.print("\nAcc Balance : " +balance);
    }
}


class SavingAccount extends Account
{
    static double defaultInterestRate = 2.5;
    double interest;
    
    SavingAccount(double acc)
    {
        super(acc);
    }
    
    void setDefaultInterestRate(double rate)
    {
        defaultInterestRate = rate;
    }
    
    void applyMonthlyInterest()
    {
        interest = balance * defaultInterestRate / 100;
        System.out.print("\nInterest : "+interest); 
    }
    
    void balance()
    {
        System.out.print("\nSA Balance : " +balance);
    }
}

class BankAccount
{
    public static void main(String[] args)
    {
        Account a = new Account(200);
        a.deposit(100);
        a.balance();
        
        SavingAccount s = new SavingAccount(500);
        s.deposit(100);
        s.balance();
        
        s.applyMonthlyInterest();
    }
}
