package Bank;

public class BankOperations {
    private int NumberOfAccount;
    private String Name;
    private double InitialDeposit;
    private double value;

    public BankOperations(String Name, int NumberOfAccount, double InitialDeposit){
        this.Name = Name;
        this.NumberOfAccount = NumberOfAccount;
        this.InitialDeposit = InitialDeposit;
        Deposit(InitialDeposit);//Pegando o valor inicial e transformando ele em valor na conta
    }
    public BankOperations(String Name, int NumberOfAccount){
        this.Name =Name;
        this.NumberOfAccount = NumberOfAccount; 
        value=0.0;
    }


    
   
    public double Deposit(double deposit){
        value+=deposit;
        return value;
    }
    public double Withdraw(double Withdraw){
        value-=Withdraw+5;
        return value;

    }
    @Override
    public String toString(){
        return "Account "+NumberOfAccount+", Holder: "+Name+ ", Balance: $ "+value;
    }
    public String toString(int x){
        return "Upted account data: \nAccount "+NumberOfAccount+", Holder: "+Name+ ", Balance: $ "+this.value;
    }
    
    

    public int getNumberOfAccount() {
        return NumberOfAccount;
    }

    public void setNumberOfAccount(int NumberOfAccount) {
        this.NumberOfAccount = NumberOfAccount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }



}
