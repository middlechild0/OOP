class bankAccount
{
    int acNo;
    String acName, acPhone, acEmail;
    double AcBal;
    public bankAccount(int acNo, String acName, String acPhone, String acEmail, double acBal)
    {
        this.acNo = acNo;
        this.acName = acName;
        this.acPhone = acPhone;
        this.acEmail = acEmail;
        this.AcBal = acBal;
    }
    public void accountHolder()
    {
        System.out.println("Account Number :" + acNo);
        System.out.println("Account Holder Name :" + acName);
        System.out.println("Account Holder Phone :" + acPhone);
        System.out.println("Account Holder Email :" + acEmail);
        System.out.println("Account Holder Balance :" + AcBal);
    }
    public void deposit(double ammount)
    {
        AcBal += ammount;
        System.out.println("Deposited: $" + ammount);
    }
    public void displayBalance()
    {
        System.out.println("Account Number: " + acNo + "\tBalance: $" + AcBal);
    }
}

class SavingsAccount extends bankAccount
{
    public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double acBal)
    {
               
        super(acNo, acName, acPhone, "", acBal);
    }
     public void deposit(double ammount)
    {
        //To add bonus to any deposit amount.
        double Bonus= 0.2 * ammount;
        AcBal += ammount + Bonus;
        System.out.println("Deposited: $" + (ammount));
        System.out.println("Bonus Granted:$" + Bonus );        
    }
}
//Current Account
class CurrentAccount extends bankAccount
{
    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double acBal)
    {
        super(acNo, acName, acPhone, acEmail, acBal);
    }
}

//Main Class
public class account{
    public static void main(String[] args) {
        System.out.println("SAVINGS ACCOUNT DETAILS");
        SavingsAccount sac = new SavingsAccount(1001, "Ann Kamau", "07200000", "test@gmail.com", 1000);
        sac.accountHolder();
        sac.deposit(500);
        sac.displayBalance();
        CurrentAccount cac = new CurrentAccount(1001, "Peter Smith", "08100000", "admin@gmail.com", 0.0);
        System.out.println("\nCURRENT ACCOUNT DETAILS");
        cac.accountHolder();
        cac.deposit(300);
        cac.displayBalance();
    }
}